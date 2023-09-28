package org.example.interfaceSolution;

public class TradicionalDeckOfCards extends DeckOfCards
{
    public TradicionalDeckOfCards(DeckOfCards deckOfCards)
    {
        this.setDeck(deckOfCards.getDeck());
    }

    @Override
    public void prepareDeck(){}

}