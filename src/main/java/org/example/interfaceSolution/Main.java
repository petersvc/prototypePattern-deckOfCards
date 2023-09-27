package org.example.interfaceSolution;

public class Main
{
    public static void main(String[] args)
    {
        // Deck original
        var fullDeck = new DeckOfCards();
        System.out.println("FullDeck Size: " + fullDeck.size());
        // Deck Clone
        var clone = fullDeck.clonar();

        var suecaFactory = new SuecaDeckOfCardsFactory();
        var sueca = (SuecaDeckOfCards) suecaFactory.orderDeckOfCardsGame(clone);
        System.out.println("Sueca Size: " + sueca.size());
        sueca.setTrunfo();

        System.out.println("Sueca Size depois de escolher o trunfo: " + sueca.size());
        System.out.println("Trunfo = [" + sueca.getTrunfo() + "]. A carta foi removida do deck e guardada como trunfo para depois voltar ao baralho.");
        // DeckOfCardsTest.deckTest(sueca);

        // Deck Clone
        var clone2 = fullDeck.clonar();
        var tradicionalFactory = new TradicionalDeckOfCardsFactory();
        var tradicional = (TradicionalDeckOfCards) tradicionalFactory.orderDeckOfCardsGame(clone2);
        System.out.println("\nTradicional Size: " + tradicional.size());
        // DeckOfCardsTest.deckTest(tradicional);
    }
}


