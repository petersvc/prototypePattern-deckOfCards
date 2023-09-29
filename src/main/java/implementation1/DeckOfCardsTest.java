package implementation1;// Aplicativo de embaralhar e distribuir cartas.

public class DeckOfCardsTest
{
   public static void deckTest(DeckOfCards myDeckOfCards)
   {
      System.out.println("\n" + myDeckOfCards.getClass().getTypeName() + " ---------------------------------------");
      
      // imprime todas as cartas na ordem em que elas sao distribuidas
      System.out.println( "Size: " + myDeckOfCards.size());
      System.out.println( myDeckOfCards);

      System.out.println( "Removendo 26 cartas a partir do topo do baralho: ");
      
      for ( int i = 0; i < 26; i++ )
      {
    	  System.out.printf( "%-20s\n",myDeckOfCards.dealCard());
         // distribui e imprime 4 Cards
      }
      System.out.println( "Size: " + myDeckOfCards.size());
      System.out.println("Fim ---------------------------------------");
   }
} // fim da classe implementation1.DeckOfCardsTest


