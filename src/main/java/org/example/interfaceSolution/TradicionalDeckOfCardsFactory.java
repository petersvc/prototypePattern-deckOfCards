package org.example.interfaceSolution;

public class TradicionalDeckOfCardsFactory extends DeckOfCardsCompany
{
    @Override
    public DeckOfCardsGame createDeckOfCardsGame(DeckOfCards deckOfCards)
    {
        return new TradicionalDeckOfCards(deckOfCards);
    }

}