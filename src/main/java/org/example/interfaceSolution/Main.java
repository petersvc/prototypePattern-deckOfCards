package org.example.interfaceSolution;

public class Main
{
    public static void main(String[] args) // DeckOfCards myDeckOfCards
    {
        var fullDeck = new DeckOfCards();
        System.out.println("FullDeck Size: " + fullDeck.size());

        var clone = fullDeck.clonar();

        var suecaFactory = new SuecaFactory();
        var sueca = (Sueca) suecaFactory.orderDeckOfCardsGame(clone);
        var suecaTrunfo = sueca.getTrunfo();

        // var sueca = new Sueca(clone);
        System.out.println("Size: " + sueca.size());
        System.out.println("Trunfo = [" + suecaTrunfo + "]. A carta foi removida do deck.");
        DeckOfCardsTest.deckTest(sueca);
    }
}


