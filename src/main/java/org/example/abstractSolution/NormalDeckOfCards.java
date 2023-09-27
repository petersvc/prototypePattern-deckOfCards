package org.example.abstractSolution;

public class NormalDeckOfCards extends DeckOfCards
{
    public NormalDeckOfCards()
    {
        super();
    }
    public NormalDeckOfCards(NormalDeckOfCards normalDeckOfCards)
    {
        super(normalDeckOfCards);
    }

    @Override
    public DeckOfCards clone()
    {
        return new NormalDeckOfCards(this);
    }
}
