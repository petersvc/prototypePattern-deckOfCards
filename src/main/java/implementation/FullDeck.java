package implementation;

public class FullDeck extends Deck
{
    public FullDeck()
    {
        super();
    }

    public FullDeck(FullDeck fullDeck) {
        super(fullDeck);
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
    public FullDeck clonar() {
        return new FullDeck(this);
    }
}
