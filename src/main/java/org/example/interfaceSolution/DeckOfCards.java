package org.example.interfaceSolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards implements Prototype, IDeckOfCards
{
    private List<Card> deck; // ArrayList usado como uma pilha de objetos
    private final int NUMBER_OF_CARDS = 52; // numero constante de Cards
    private Random randomNumbers; // gerador de numero aleatorio

    // construtor preenche baralho de cartas
    public DeckOfCards()
    {
        deck = new ArrayList<Card>(); // cria List de objetos Card
        randomNumbers = new Random(); // cria gerador de n�mero aleat�rio
        prepareDeck();
    } // fim do construtor DeckOfCards

    // Construtor de copia
    private DeckOfCards(DeckOfCards deckOfCards)
    {
        this.deck = new ArrayList<Card>();
        this.deck.addAll(deckOfCards.deck);
        this.randomNumbers = new Random();
    }

    public void prepareDeck() {
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        // preenche baralho com objetos Card
        for ( int count = 0; count < NUMBER_OF_CARDS; count++ )   {
            deck.add(new Card( faces[ count % 13 ], suits[ count / 13 ], (count % 13)+1  ));
        }
    }

    public boolean hasCard()
    {
        return deck.size() > 0;
    }

    public void shuffle()
    {
        // depois de embaralhar, a distribui��o deve iniciar em deck[ 0 ] novamente


        // para cada Card, seleciona outro Card aleat�rio e os compara
        for ( int first = 0; first < deck.size(); first++ )
        {
            // seleciona um n�mero aleat�rio entre 0 e 51
            int second =  randomNumbers.nextInt( NUMBER_OF_CARDS );

            // compara Card atual com Card aleatoriamente selecionado
            Card temp = deck.remove( second );
            deck.add(0, temp);
        } // for final
    } // fim do m�todo shuffle

    public Card dealCard()
    {
        return deck.remove(deck.size()-1); // retorna Card atual no array
    } // fim do m�todo dealCard


    public int size()
    {
        return deck.size();
    }

    public String toString()
    {
        String s = "";
        for (Card card : deck) {
            s += card.toString() + "\n";
        }
        return s;
    }

    public DeckOfCards clonar() {
        return new DeckOfCards(this);
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> newDeck) {
        this.deck = new ArrayList<>();
        this.deck.addAll(newDeck);
    }

    public Random getRandomNumbers() {
        return randomNumbers;
    }
}
