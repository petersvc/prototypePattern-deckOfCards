package org.example.interfaceSolution;

public class Tradicional implements DeckOfCardsGame{
    private DeckOfCards deck; // ArrayList usado como uma pilha de objetos

    // construtor preenche baralho de cartas
    public Tradicional()
    {
    } // fim do construtor DeckOfCards

    public Tradicional(DeckOfCards deckOfCards)
    {
        this.deck = deckOfCards;
        // prepareDeck();
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