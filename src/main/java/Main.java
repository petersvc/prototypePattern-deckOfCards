public class Main
{
    public static void main(String[] args)
    {
        // Deck original
        var fullDeck = new DeckOfCards();
        System.out.println("FullDeck Size: " + fullDeck.size());

        // Deck Clone
        var suecaDeck = fullDeck.clonar();
        var suecaSetup = new SuecaSetup();
        suecaSetup.setupDeckOfCards(suecaDeck);
        System.out.println("SuecaDeck Size: " + suecaDeck.size());
        System.out.println("SuecaDeck: \n" + suecaDeck);

    }
}


