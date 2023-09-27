package org.example.interfaceSolution;

public class Main
{
    public static void main(String[] args) // DeckOfCards myDeckOfCards
    {
        var normalDeck = new NormalDeckOfCards();
        var normalDeckClone = normalDeck.clonar();
        var suecaDeck = new SuecaDeckOfCards(normalDeckClone);
        System.out.println("Size: " + suecaDeck.size());
        suecaDeck.setTrunfo();
        System.out.println("Trunfo = [" + suecaDeck.getTrunfo() + "]. A carta foi removida do deck.");
        DeckOfCardsTest.deckTest(suecaDeck);
    }
}


