package implementation;

public class SuecaDeck extends Deck
{
    private Card trumpCard; // carta de trunfo

    public SuecaDeck() {
        super();
        setTrumpCard();
    }

    public SuecaDeck(SuecaDeck suecaDeck) {
        super(suecaDeck);
        this.trumpCard = suecaDeck.getTrumpCard();
    }

    @Override
    public void setFaces() {
        this.faces = new String[]{"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Jack", "Queen", "King"};
    }

    @Override
    public void setSuits() {
        this.suits = new String[]{"Hearts", "Diamonds", "Clubs", "Spades"};
    }

    @Override
    public void setValues() {
        int numberOfCards = 40;

        for (int count = 0; count < numberOfCards; count++)
        {
            String face = faces[count % 10];
            String suit = suits[count / 10];
            int value;

            switch (face)
            {
                case "Ace" -> value = 11;
                case "Seven" -> value = 10;
                case "King" -> value = 4;
                case "Jack" -> value = 3;
                case "Queen" -> value = 2;
                default -> value = 0;
            }

            this.getDeck().add(new Card(face, suit, (value)));
        }
    }

    public void setTrumpCard() {
        this.trumpCard = this.getDeck().get(this.getRandomNumber());
    }

    public Card getTrumpCard() {
        return this.trumpCard;
    }

    @Override
    public SuecaDeck clonar() {
        return new SuecaDeck(this);
    }
}
