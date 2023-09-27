package org.example.interfaceSolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class SuecaDeckOfCards implements DeckOfCards
{
    private List<Card> deck;
    private final int NUMBER_OF_CARDS = 40;
    private Random randomNumbers;

    private Card trunfo;

    public SuecaDeckOfCards(NormalDeckOfCards normalDeckOfCards)
    {
        this.deck = new ArrayList<Card>();
        this.deck.addAll(normalDeckOfCards.getDeck());
        this.randomNumbers = new Random();
        prepareDeck();
    }

    @Override
    public void prepareDeck()
    {
        for (int i = 0; i < deck.size(); i++)
        {
            Card card = deck.get(i);
            String face = card.getFace();

            if (face.equals("Eight") || face.equals("Nine") || face.equals("Ten"))
            {
                deck.remove(i);
                i--;
            }

            switch (face) {
                case "Ace" -> card.setValue(11);
                case "Seven" -> card.setValue(10);
                case "King" -> card.setValue(4);
                case "Jack" -> card.setValue(3);
                case "Queen" -> card.setValue(2);
                default -> card.setValue(0);
            }
        }
    }

    public Card getTrunfo() {
        return trunfo;
    }

    public void setTrunfo() {
        var trunfoIndex = randomNumbers.nextInt(deck.size());
        var trunfo = deck.get(trunfoIndex);
        this.trunfo = trunfo;
        deck.remove(trunfoIndex);
    }

    public void restoreTrunfo() {
        deck.add(trunfo);
        trunfo = null;
    }

    @Override
    public boolean hasCard()
    {
        return deck.size() > 0;
    }
    @Override
    public void shuffle()
    {
        for ( int first = 0; first < deck.size(); first++ )
        {
            int second =  randomNumbers.nextInt( NUMBER_OF_CARDS );
            Card temp = deck.remove( second );
            deck.add(0, temp);
        }
    }

    public Card dealCard()
    {
        return deck.remove(deck.size()-1);
    }

    public int size()
    {
        return deck.size();
    }

    public String toString()
    {
        String s = "";
        for (Card card : deck) {
            s += card.toString() + "\n";
        }
        return s;
    }
}
