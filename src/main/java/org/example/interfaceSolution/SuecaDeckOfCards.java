package org.example.interfaceSolution;

public class SuecaDeckOfCards extends DeckOfCards
{
    public Card trunfo;

    public SuecaDeckOfCards(DeckOfCards deckOfCards)
    {
        this.setDeck(deckOfCards.getDeck());
    }

    @Override
    public void prepareDeck()
    {
        var deck = this.getDeck();
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
        return this.trunfo;
    }

    public void setTrunfo() {
        var deck = this.getDeck();
        var trunfoIndex = this.getRandomNumbers().nextInt(deck.size());
        var trunfo = deck.get(trunfoIndex);
        this.trunfo = trunfo;
        deck.remove(trunfoIndex);
    }

    public void restoreTrunfo() {
        this.getDeck().add(trunfo);
        trunfo = null;
    }
}
