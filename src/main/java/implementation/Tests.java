package implementation;

public class Tests
{

    // Testa se o tamanho dois baralhos mudam após a remoção de um elemento em um dos baralhos
    public static void sizeTest(Deck original, Deck clone)
    {
        var elementoZeroDoOriginal = original.getDeck().get(0);
        original.getDeck().remove(0);

        System.out.println("---------------- Size test ----------------");
        if(original.size() != clone.size())
        {
            System.out.println("São diferentes");
            System.out.println("Size original: " + original.size() + "\nSize clone: " + clone.size());
        }
        else
        {
            System.out.println("São iguais");
            System.out.println("Size original: " + original.size() + "\nSize clone: " + clone.size());
        }

        original.getDeck().add(0, elementoZeroDoOriginal);
    }

    // testa se os hashCodes dos baralhos são iguais
    public static void hashTest(Deck original, Deck clone)
    {

        System.out.println("---------------- Hash test ----------------");
        if(original.hashCode() != clone.hashCode())
        {
            System.out.println("São diferentes");
            System.out.println("hashCode original: " + original.hashCode() + "\nhashCode clone: " + clone.hashCode());
        }
        else
        {
            System.out.println("São iguais");
            System.out.println("hashCode original: " + original.hashCode() + "\nhashCode clone: " + clone.hashCode());
        }
    }

    public static void deckTest(Deck deck)
    {
        System.out.println("\n" + deck.getClass().getTypeName() + " ---------------------------------------");

        // imprime todas as cartas na ordem em que elas sao distribuidas
        System.out.println( "Size: " + deck.size());
        System.out.println(deck);

        System.out.println( "Removendo 26 cartas a partir do topo do baralho: ");

        for ( int i = 0; i < 26; i++ )
        {
            System.out.printf( "%-20s\n", deck.dealCard());
            // distribui e imprime 4 Cards
        }
        System.out.println( "Size: " + deck.size());
        System.out.println("Fim ---------------------------------------");
    }

}
