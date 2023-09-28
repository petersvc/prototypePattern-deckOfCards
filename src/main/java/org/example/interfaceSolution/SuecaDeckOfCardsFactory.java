package org.example.interfaceSolution;

public class SuecaDeckOfCardsFactory extends DeckOfCardsCompany
{
    @Override
    public DeckOfCards createDeckOfCards(DeckOfCards deckOfCards)
    {
        return new SuecaDeckOfCards(deckOfCards);
    }

}

