package org.example.sandbox.cards.standard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck implements IDeck {

    private List<Card> cards;

    public Deck() {
        this.cards = newDeck();
    }

    private List<Card> newDeck() {
        List<Card> deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
        return deck;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public void cut(int index) {
        List<Card> top = cards.subList(0, index);
        List<Card> bottom = cards.subList(index, cards.size());
        cards.clear();
        cards.addAll(bottom);
        cards.addAll(top);
    }

    @Override
    public Card deal() {
        return cards.removeFirst();
    }

    @Override
    public void newOrder() {
        Collections.sort(cards);
    }

    @Override
    public int search(Card card) {
        return cards.indexOf(card);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public int size() {
        return cards.size();
    }

    @Override
    public Card turnOver() {
        return cards.getFirst();
    }
}
