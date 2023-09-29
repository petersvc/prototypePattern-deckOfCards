package implementation;

public class Sueca extends CardGame
{
    public Sueca() {
        super();
    }

    // Copy constructor
    public Sueca(Sueca sueca) {
        super(sueca);
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

            switch (face) {
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

    @Override
    public Sueca clonar() {
        return new Sueca(this);
    }
}
