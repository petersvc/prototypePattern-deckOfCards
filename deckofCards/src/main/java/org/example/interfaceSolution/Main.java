package org.example.interfaceSolution;

public class Main
{
    public static void main(String[] args) // DeckOfCards myDeckOfCards
    {
        // DeckOfCards normalDeck = new NormalDeckOfCards();
        // DeckOfCards normalDeck2 = normalDeck.clone();
        DeckOfCards suecaDeck = new SuecaDeckOfCards();
        DeckOfCards suecaDeck2 = suecaDeck.clone();
        suecaDeck2.shuffle();
        // DeckOfCardsTest.deckTest(normalDeck);
        DeckOfCardsTest.deckTest(suecaDeck);
        // System.out.println(suecaDeck2.size());
        // System.out.println(suecaDeck.size());
        DeckOfCardsTest.deckTest(suecaDeck2);
    }
}


