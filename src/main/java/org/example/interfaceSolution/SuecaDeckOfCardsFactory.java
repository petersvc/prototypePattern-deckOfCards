package org.example.interfaceSolution;

public class SuecaDeckOfCardsFactory extends DeckOfCardsCompany
{
    @Override
    public DeckOfCardsGame createDeckOfCardsGame(DeckOfCards deckOfCards)
    {
        return new SuecaDeckOfCards(deckOfCards);
    }

}

