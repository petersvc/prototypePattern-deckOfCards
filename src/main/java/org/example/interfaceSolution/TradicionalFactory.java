package org.example.interfaceSolution;

public class TradicionalFactory extends DeckOfCardsCompany
{
    @Override
    public DeckOfCardsGame createDeckOfCardsGame(DeckOfCards deckOfCards)
    {
        return new Tradicional(deckOfCards);
    }

}