package implementation;

public class Card
{
   private String face; // face da carta ("Ace", "Deuce", ...)
   private String suit; // naipe da carta ("Hearts", "Diamonds", ...)
   private int value;

   // construtor de dois argumentos inicializa face e naipe da carta
   public Card(String cardFace, String cardSuit, int cardValue)
   {
      face = cardFace; // inicializa face da carta
      suit = cardSuit; // inicializa naipe da carta
      value = cardValue;
   }

   public String toString()               
   {                                      
      return face + " of " + suit + ", value " + value;        
   }

}


