package org.example.interfaceSolution;

public interface DeckOfCards
{
   void prepareDeck();
   void shuffle();
   Card dealCard();
   boolean hasCard();
   int size();
   String toString();
}


