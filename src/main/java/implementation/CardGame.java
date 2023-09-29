package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Template Method
public abstract class CardGame
{
    private List<Card> deck; // ArrayList usado como uma pilha de objetos
    private final Random randomNumbers; // gerador de numero aleatorio
    protected String[] faces;
    protected String[] suits;

    public CardGame()
    {
        this.deck = new ArrayList<>();
        this.randomNumbers = new Random();
        this.setup();
    }

    public CardGame(CardGame deckOfCards)
    {
        this.deck = new ArrayList<>(deckOfCards.getDeck());
        this.randomNumbers = new Random();
        this.faces = deckOfCards.getFaces();
        this.suits = deckOfCards.getSuits();
    }

    public void setup()
    {
        setFaces();
        setSuits();
        setValues();
        shuffle();
    }

    public String[] getSuits() {
        return this.suits;
    }

    public String[] getFaces() {
        return this.faces;
    }

    public Random getRandomNumbers() {
        return randomNumbers;
    }

    public List<Card> getDeck() {
        return this.deck;
    }

    public abstract void setFaces();

    public abstract void setSuits();

    public abstract void setValues();

    public void shuffle()
    {
        // depois de embaralhar, a distribuiçao deve iniciar em deck[ 0 ] novamente

        // para cada implementation1.Card, seleciona outro implementation1.Card aleat�rio e os compara
        var deck = this.getDeck();
        for (int first = 0; first < deck.size(); first++)
        {
            // seleciona um numero aleatorio entre 0 e o tamanho do deck
            int second =  new Random().nextInt(this.size());

            // compara implementation1.Card atual com implementation1.Card aleatoriamente selecionado
            Card temp = deck.remove(second);
            deck.add(0, temp);
        } // for final
    } // fim do método shuffle

    public Card dealCard()
    {
        return deck.remove(deck.size()-1);
    }

    public int size()
    {
        return deck.size();
    }

    public boolean hasCard()
    {
        return !deck.isEmpty();
    }

    public String toString()
    {
        StringBuilder s = new StringBuilder();
        for (Card card : deck) {
            s.append(card.toString()).append("\n");
        }
        return s.toString();
    }

    public abstract CardGame clonar();


}
