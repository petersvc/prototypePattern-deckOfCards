package org.example.abstractSolution;

public class Main
{
    public static void main(String[] args) // DeckOfCards myDeckOfCards
    {
        DeckOfCards normalDeck = new NormalDeckOfCards();
        DeckOfCards suecaDeck = new SuecaDeckOfCards();
        DeckOfCardsTest.deckTest(normalDeck);
        DeckOfCardsTest.deckTest(suecaDeck);
    }
}


