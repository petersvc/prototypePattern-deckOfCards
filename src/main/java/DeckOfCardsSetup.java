import java.util.Random;

public abstract class DeckOfCardsSetup
{
    void setupDeckOfCards(DeckOfCards deckOfCards)
    {
        SetCardsProperties(deckOfCards);
        shuffle(deckOfCards);
    }

    void SetCardsProperties(DeckOfCards deckOfCards)
    {
        var deck = deckOfCards.getDeck();
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        // preenche baralho com objetos Card
        for (int count = 0; count < deckOfCards.getNumberOfCards(); count++ )   {
            deck.add(new Card( faces[ count % 13 ], suits[ count / 13 ], (count % 13)+1  ));
        }
    }
    void shuffle(DeckOfCards deckOfCards)
    {
        // depois de embaralhar, a distribuiçao deve iniciar em deck[ 0 ] novamente

        // para cada Card, seleciona outro Card aleat�rio e os compara
        var deck = deckOfCards.getDeck();
        for ( int first = 0; first < deck.size(); first++ )
        {
            // seleciona um numero aleatorio entre 0 e o tamanho do deck
            int second =  new Random().nextInt(deckOfCards.getNumberOfCards());

            // compara Card atual com Card aleatoriamente selecionado
            Card temp = deck.remove(second);
            deck.add(0, temp);
        } // for final
    } // fim do método shuffle
}
