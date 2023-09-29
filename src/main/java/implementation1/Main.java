package implementation1;

public class Main
{
    public static void main(String[] args)
    {
        // Deck original
        var fullDeckSetup = new FullDeckSetup();
        var suecaDeckSetup = new SuecaDeckSetup();

        var fullDeck = fullDeckSetup.setup(new DeckOfCards());
        var suecaDeck = suecaDeckSetup.setup(fullDeck.clonar());

        var prototypeRegistry = new PrototypeRegistry();

        prototypeRegistry.addPrototype("fullDeck", fullDeck);
        prototypeRegistry.addPrototype("suecaDeck", suecaDeck);

        DeckOfCards fullDeckClone = (DeckOfCards) prototypeRegistry.getPrototype("fullDeck");
        DeckOfCards suecaDeckClone = (DeckOfCards) prototypeRegistry.getPrototype("suecaDeck");

        // Testes
        System.out.println("\nTestes de clonagem: fullDeck e suecaDeck");

        Tests.sizeTest(fullDeck, suecaDeck);
        Tests.hashTest(fullDeck, suecaDeck);

        System.out.println("\nTestes de clonagem: fullDeck e fullDeckClone");

        Tests.sizeTest(fullDeck, fullDeckClone);
        Tests.hashTest(fullDeck, fullDeckClone);

        System.out.println("\nTestes de clonagem: suecaDeck e suecaDeckClone");

        Tests.sizeTest(suecaDeck, suecaDeckClone);
        Tests.hashTest(suecaDeck, suecaDeckClone);

        System.out.println("\nTestes de clonagem: fullDeckClone e fullDeckClone2");

        var fullDeckClone2 = fullDeckClone;

        Tests.sizeTest(fullDeckClone, fullDeckClone2);
        Tests.hashTest(fullDeckClone, fullDeckClone2);

    }
}


