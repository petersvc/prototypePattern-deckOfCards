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
        var sueca = (SuecaDeckOfCards) suecaFactory.orderDeckOfCards(clone);
        System.out.println("Sueca Size: " + sueca.size());
        System.out.println("clone Size: " + clone.size());
        sueca.setTrunfo();
        System.out.println("Sueca Size depois de escolher o trunfo: " + sueca.size());
        System.out.println("Trunfo = [" + sueca.getTrunfo() + "]. A carta foi removida do deck e guardada como trunfo para depois voltar ao baralho.");
        // DeckOfCardsTest.deckTest(sueca);

        System.out.println("FullDeck Size: " + fullDeck.size());
        var tradicionalFactory = new TradicionalDeckOfCardsFactory();
        var tradicional = (TradicionalDeckOfCards) tradicionalFactory.orderDeckOfCards(clone);
        System.out.println("\nTradicional Size: " + tradicional.size());
        System.out.println("clone Size: " + clone.size());
        // DeckOfCardsTest.deckTest(tradicional);
    }
}


