package org.example.interfaceSolution;

public class SuecaFactory extends DeckOfCardsCompany
{
    @Override
    public DeckOfCardsGame createDeckOfCardsGame(DeckOfCards deckOfCards)
    {
        return new Sueca(deckOfCards);
    }

}

