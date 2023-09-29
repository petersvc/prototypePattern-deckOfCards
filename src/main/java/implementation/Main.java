package implementation;

public class Main
{
    public static void main(String[] args)
    {
        // Deck original
        var deckOfCards = new DeckOfCards();
        var sueca = new Sueca();

        var prototypeRegistry = new PrototypeRegistry();

        prototypeRegistry.addPrototype("deckOfCards", deckOfCards);
        prototypeRegistry.addPrototype("sueca", sueca);

        var deckOfCardsClone = prototypeRegistry.getPrototype("deckOfCards");
        var suecaClone = prototypeRegistry.getPrototype("sueca");

        // Testes
        System.out.println("\nTestes de clonagem: deckOfCards e sueca");

        Tests.sizeTest(deckOfCards, sueca);
        Tests.hashTest(deckOfCards, sueca);

        System.out.println("\nTestes de clonagem: deckOfCards e DeckOfCardsClone");

        Tests.sizeTest(deckOfCards, deckOfCardsClone);
        Tests.hashTest(deckOfCards, deckOfCardsClone);

        System.out.println("\nTestes de clonagem: sueca e suecaClone");

        Tests.sizeTest(sueca, suecaClone);
        Tests.hashTest(sueca, suecaClone);

        System.out.println("\nTestes de clonagem: deckOfCardsClone e deckOfCardsClone2");

        var deckOfCardsClone2 = deckOfCardsClone;

        Tests.sizeTest(deckOfCardsClone, deckOfCardsClone2);
        Tests.hashTest(deckOfCardsClone, deckOfCardsClone2);

        // Tests.deckTest(deckOfCards);
        // Tests.deckTest(sueca);
        // Tests.deckTest(deckOfCardsClone);
        // Tests.deckTest(suecaClone);


    }
}


