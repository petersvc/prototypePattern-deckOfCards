package org.example.interfaceSolution;

public abstract class DeckOfCardsCompany {
    public IDeckOfCards orderDeckOfCards(DeckOfCards clone)
    {
        IDeckOfCards deckOfCards = createDeckOfCards(clone);
        deckOfCards.prepareDeck();

        return deckOfCards;
    };
    public abstract IDeckOfCards createDeckOfCards(DeckOfCards clone);
}
