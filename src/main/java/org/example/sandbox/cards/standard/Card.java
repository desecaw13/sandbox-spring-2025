package org.example.sandbox.cards.standard;

import java.util.Comparator;
import java.util.Objects;

public class Card implements Comparable<Card> {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(suit.toString());
        sb.append(" of ").append(rank);
        return sb.toString();
    }

    @Override
    public int compareTo(Card o) {
        return Comparator.comparing(Card::getRank).thenComparing(Card::getSuit).compare(this, o);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Card card)) return false;
        return suit == card.suit && rank == card.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }
}
