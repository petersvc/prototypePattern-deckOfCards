package org.example.interfaceSolution;

public class TradicionalDeckOfCards implements DeckOfCardsGame{
    private DeckOfCards deck;
    public TradicionalDeckOfCards()
    {
    }

    public TradicionalDeckOfCards(DeckOfCards deckOfCards)
    {
        this.deck = deckOfCards;
    }
    public void prepareDeck() {
    }

    public boolean hasCard()
    {
        return deck.size() > 0;
    }

    public void shuffle()
    {
        for ( int first = 0; first < deck.size(); first++ )
        {
            int second =  deck.getRandomNumbers().nextInt( this.size() );
            Card temp = deck.getDeck().remove( second );
            deck.getDeck().add(0, temp);
        }
    }

    public Card dealCard()
    {
        return deck.getDeck().remove(deck.size()-1);
    }

    public int size()
    {
        return deck.size();
    }

    public String toString()
    {
        String s = "";
        for (Card card : deck.getDeck()) {
            s += card.toString() + "\n";
        }
        return s;
    }


}