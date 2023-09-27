package org.example.interfaceSolution;

public class Sueca implements DeckOfCardsGame
{
    public DeckOfCards deck;

    public Card trunfo;

    public Sueca()
    {
    }

    public Sueca(DeckOfCards deckOfCards)
    {
        this.deck = deckOfCards;
        // prepareDeck();
    }

    public void setDeckOfCards(DeckOfCards deckOfCards)
    {
        this.deck = deckOfCards;
    }

    public void prepareDeck()
    {
        var deck = this.deck.getDeck();
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
        this.setTrunfo();
    }

    public Card getTrunfo() {
        return this.trunfo;
    }

    public void setTrunfo() {
        var trunfoIndex = deck.getRandomNumbers().nextInt(deck.size());
        var trunfo = deck.getDeck().get(trunfoIndex);
        this.trunfo = trunfo;
        deck.getDeck().remove(trunfoIndex);
    }

    public void restoreTrunfo() {
        deck.getDeck().add(trunfo);
        trunfo = null;
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
