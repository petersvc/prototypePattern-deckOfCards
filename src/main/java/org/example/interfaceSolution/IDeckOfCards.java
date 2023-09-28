package org.example.interfaceSolution;

import java.util.List;

public interface IDeckOfCards
{
    void prepareDeck();
    boolean hasCard();
    void shuffle();
    Object dealCard();
    int size();
    List<Card> getDeck();
    String toString();
}
