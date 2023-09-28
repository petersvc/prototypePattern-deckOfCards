package org.example.interfaceSolution;

public class TradicionalDeckOfCardsFactory extends DeckOfCardsCompany
{
    @Override
    public DeckOfCards createDeckOfCards(DeckOfCards deckOfCards)
    {
        return new TradicionalDeckOfCards(deckOfCards);
    }

}