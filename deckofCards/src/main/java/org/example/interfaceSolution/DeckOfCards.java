package org.example.interfaceSolution;

public interface DeckOfCards
{
   void shuffle();
   Card dealCard();
   boolean hasCard();
   int size();
   String toString();
   DeckOfCards clone();

   void removeLastCard();
}


