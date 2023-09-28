import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards extends DeckOfCardsSetup implements Prototype
{
    private List<Card> deck; // ArrayList usado como uma pilha de objetos
    private int numberOfCards = 52; // numero constante de Cards
    private final Random randomNumbers; // gerador de numero aleatorio

    // construtor preenche baralho de cartas
    public DeckOfCards()
    {
        deck = new ArrayList<Card>(); // cria List de objetos Card
        randomNumbers = new Random(); // cria gerador de n�mero aleat�rio
        this.setupDeckOfCards(this);
    } // fim do construtor DeckOfCards

    // Construtor de copia
    private DeckOfCards(DeckOfCards deckOfCards)
    {
        this.deck = new ArrayList<>();
        this.deck.addAll(deckOfCards.deck);
        this.randomNumbers = new Random();
        this.numberOfCards = deckOfCards.numberOfCards;
    }

    public boolean hasCard()
    {
        return !deck.isEmpty();
    }

    public Card dealCard()
    {
        return deck.remove(deck.size()-1); // retorna Card atual no array
    } // fim do metodo dealCard


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

    public void setNumberOfCards(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }
}
