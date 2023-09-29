package implementation;

public class Tests
{
    public static void sizeTest(CardGame original, CardGame clone)
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

    public static void hashTest(CardGame original, CardGame clone)
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

    public static void deckTest(CardGame cardGame)
    {
        System.out.println("\n" + cardGame.getClass().getTypeName() + " ---------------------------------------");

        // imprime todas as cartas na ordem em que elas sao distribuidas
        System.out.println( "Size: " + cardGame.size());
        System.out.println( cardGame);

        System.out.println( "Removendo 26 cartas a partir do topo do baralho: ");

        for ( int i = 0; i < 26; i++ )
        {
            System.out.printf( "%-20s\n",cardGame.dealCard());
            // distribui e imprime 4 Cards
        }
        System.out.println( "Size: " + cardGame.size());
        System.out.println("Fim ---------------------------------------");
    }

}
