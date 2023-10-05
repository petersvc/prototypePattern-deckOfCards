package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Classe abstrata que representa um baralho de cartas e implementa os padrões Prototype e Template Method
public abstract class Deck
{
    private List<Card> deck;
    protected String[] faces;
    protected String[] suits;

    // construtor vazio para criação de um baralho original
    public Deck()
    {
        this.deck = new ArrayList<>();
        this.setup(); // Metodo que resume a implementação do Template Method
    }

    // construtor para criação de um baralho clone
    public Deck(Deck deckOfCards)
    {
        this.deck = new ArrayList<>(deckOfCards.getDeck());
        this.faces = deckOfCards.getFaces();
        this.suits = deckOfCards.getSuits();
    }

    // base da implementação do Template Method: configura as faces, naipes e valores das cartas e embaralha
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

    // retorna um numero aleatorio entre 0 e o tamanho do baralho
    public int getRandomNumber() {
        return new Random().nextInt(this.size());
    }

    public List<Card> getDeck() {
        return this.deck;
    }


    // metodos abstratos que devem ser implementados pelas classes filhas, devido à especificidade de cada baralho
    public abstract void setFaces();

    public abstract void setSuits();

    public abstract void setValues();
    // fim dos metodos abstratos

    // metodo que embaralha o baralho
    public void shuffle()
    {
        // para cada carta, seleciona outra aleatoria e as compara
        var deck = this.getDeck();
        for (int first = 0; first < deck.size(); first++)
        {
            // seleciona um numero aleatorio entre 0 e o tamanho do deck
            int second = this.getRandomNumber();

            // compara a carta atual com uma outra aleatoriamente selecionada
            Card temp = deck.remove(second);
            deck.add(0, temp);
        }
    }

    public Card dealCard()
    {
        return deck.remove(deck.size()-1);
    }

    public int size()
    {
        return deck.size();
    }

    public String toString()
    {
        StringBuilder s = new StringBuilder();
        for (Card card : deck) {
            s.append(card.toString()).append("\n");
        }
        return s.toString();
    }

    // metodo que retorna um clone do baralho: implementação do padrão Prototype
    public abstract Deck clonar();
}
