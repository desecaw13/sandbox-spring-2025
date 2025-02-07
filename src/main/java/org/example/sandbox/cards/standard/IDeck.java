package org.example.sandbox.cards.standard;

public interface IDeck {

    void cut(int index);

    Card deal();

    void newOrder();

    int search(Card card);

    void shuffle();

    int size();

    Card turnOver();
}
