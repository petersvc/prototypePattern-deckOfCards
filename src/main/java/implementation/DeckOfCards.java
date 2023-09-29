package implementation;

public class DeckOfCards extends CardGame
{
    public DeckOfCards()
    {
        super();
    }

    // copy constructor
    public DeckOfCards(DeckOfCards deckOfCards) {
        super(deckOfCards);
    }

    @Override
    public void setFaces() {
        this.faces = new String[]{"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    }
    @Override
    public void setSuits() {
        this.suits = new String[]{"Hearts", "Diamonds", "Clubs", "Spades"};
    }
    @Override
    public void setValues() {
        int numberOfCards = 52;
        System.out.println(this.getDeck().size());
        for (int count = 0; count < numberOfCards; count++)
        {
            this.getDeck().add(new Card(faces[count % 13], suits[count / 13], (count % 13) + 1));
        }
    }

    @Override
    public DeckOfCards clonar() {
        return new DeckOfCards(this);
    }
}
