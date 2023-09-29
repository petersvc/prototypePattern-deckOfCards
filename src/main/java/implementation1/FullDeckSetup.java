package implementation1;

public class FullDeckSetup extends DeckOfCardsSetup
{
    @Override
    public void SetCardsProperties()
    {
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        // preenche baralho com objetos implementation1.Card
        for (int count = 0; count < targetDeck.getNumberOfCards(); count++)
        {
            targetDeck.getDeck().add(new Card(faces[count % 13], suits[count / 13], (count % 13) + 1));
        }
    }
}
