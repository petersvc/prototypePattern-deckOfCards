package org.example.interfaceSolution;

public interface DeckOfCardsGame
{
    public abstract void prepareDeck();

    public abstract void setDeckOfCards(DeckOfCards clone);

    public abstract int size();
}
