package implementation;

public class Main
{
    public static void main(String[] args)
    {
        // Cria decks originais
        var fullDeck = new FullDeck();
        var suecaDeck = new SuecaDeck();

        // Instancia a classe que registra os prototipos
        var prototypeRegistry = new PrototypeRegistry();

        // Adiciona os prototipos (decks originais) ao registro
        prototypeRegistry.addPrototype("full", fullDeck);
        prototypeRegistry.addPrototype("sueca", suecaDeck);

        // Decks clones
        var fullDeckClone = (FullDeck) prototypeRegistry.getPrototype("full");
        var suecaDeckClone = (SuecaDeck) prototypeRegistry.getPrototype("sueca");

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

        // Tests.deckTest(fullDeck);
        // Tests.deckTest(suecaDeck);
        // Tests.deckTest(fullDeckClone);
        // Tests.deckTest(suecaDeckClone);
    }
}


