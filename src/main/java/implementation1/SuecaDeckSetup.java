package implementation1;

public class SuecaDeckSetup extends DeckOfCardsSetup
{
    @Override
    public void SetCardsProperties()
    {
        targetDeck.setNumberOfCards(40);
        for (int i = 0; i < targetDeck.size(); i++)
        {
            Card card = targetDeck.getDeck().get(i);
            String face = card.getFace();

            if (face.equals("Eight") || face.equals("Nine") || face.equals("Ten"))
            {
                targetDeck.getDeck().remove(i);
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
}
