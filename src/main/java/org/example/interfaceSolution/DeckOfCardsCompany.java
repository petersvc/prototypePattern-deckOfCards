package org.example.interfaceSolution;

public abstract class DeckOfCardsCompany {
    public DeckOfCardsGame orderDeckOfCardsGame(DeckOfCards deckOfCards)
    {
        DeckOfCardsGame deckOfCardsGame = createDeckOfCardsGame(deckOfCards);
        deckOfCardsGame.prepareDeck();
        return deckOfCardsGame;
    };
    public abstract DeckOfCardsGame createDeckOfCardsGame(DeckOfCards deckOfCards);
}
