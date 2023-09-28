package org.example.interfaceSolution;// Fig. 7.11: DeckOfCardsTest.java
// Aplicativo de embaralhar e distribuir cartas.

public class DeckOfCardsTest
{
   public static void deckTest(IDeckOfCards myDeckOfCards)
   {
      System.out.println(myDeckOfCards.getClass().getName() + "---------------------------------------");
      
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
} // fim da classe DeckOfCardsTest


