public class SuecaSetup extends DeckOfCardsSetup
{
    @Override
    public void SetCardsProperties(DeckOfCards deckOfCards)
    {
        deckOfCards.setNumberOfCards(40);
        var cards = deckOfCards.getDeck();
        for (int i = 0; i < deckOfCards.size(); i++)
        {
            Card card = cards.get(i);
            String face = card.getFace();

            if (face.equals("Eight") || face.equals("Nine") || face.equals("Ten"))
            {
                cards.remove(i);
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
