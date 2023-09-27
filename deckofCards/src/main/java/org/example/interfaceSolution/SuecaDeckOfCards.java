package org.example.interfaceSolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SuecaDeckOfCards implements DeckOfCards
{
    private List<Card> deck; // ArrayList usado como uma pilha de objetos
    private final int NUMBER_OF_CARDS = 40; // numero constante de Cards
    private Random randomNumbers; // gerador de numero aleatorio

    // construtor preenche baralho de cartas
    public SuecaDeckOfCards()
    {
        String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

        deck = new ArrayList<Card>(); // cria List de objetos Card
        randomNumbers = new Random(); // cria gerador de n�mero aleat�rio

        // preenche baralho com objetos Card
        for ( int count = 0; count < NUMBER_OF_CARDS; count++ )   {
            deck.add(new Card( faces[ count % 13 ], suits[ count / 13 ], (count % 13)+1  ));
        }
    } // fim do construtor DeckOfCards

    public void removeLastCard()
    {
    	deck.remove(deck.size()-1);
    }
    private SuecaDeckOfCards(SuecaDeckOfCards SuecaDeckOfCards)
    {
        this.deck = new ArrayList<Card>();
        this.deck.addAll(SuecaDeckOfCards.deck);
        this.randomNumbers = new Random();
    }

    @Override
    public boolean hasCard()
    {
        return deck.size() > 0;
    }
    // embaralha as cartas com um algoritmo de uma passagem
    @Override
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
    @Override
    public SuecaDeckOfCards clone()
    {
        return new SuecaDeckOfCards(this);
    }
}
