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

        System.out.println("Size: " + sueca.size());
        System.out.println("Trunfo = [" + suecaTrunfo + "]. A carta foi removida do deck.");
        DeckOfCardsTest.deckTest(sueca);

        var clone2 = fullDeck.clonar();
        var tradicionalFactory = new TradicionalFactory();
        var tradicional = (Tradicional) tradicionalFactory.orderDeckOfCardsGame(clone2);
        System.out.println("Size: " + tradicional.size());
        DeckOfCardsTest.deckTest(tradicional);
    }
}


