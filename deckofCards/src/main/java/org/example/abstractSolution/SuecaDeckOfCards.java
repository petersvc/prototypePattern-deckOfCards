package org.example.abstractSolution;

public class SuecaDeckOfCards extends DeckOfCards
{
        public SuecaDeckOfCards()
        {
            super();
        }
        public SuecaDeckOfCards(SuecaDeckOfCards suecaDeckOfCards)
        {
            super(suecaDeckOfCards);
        }

        @Override
        public DeckOfCards clone()
        {
            return new SuecaDeckOfCards(this);
        }
}
