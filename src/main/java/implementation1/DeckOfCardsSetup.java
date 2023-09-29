package implementation1;

import java.util.Random;

// Template Method
public abstract class DeckOfCardsSetup
{
    protected DeckOfCards targetDeck;

    public DeckOfCards setup(DeckOfCards deckOfCards)
    {
        this.targetDeck = deckOfCards;
        SetCardsProperties();
        shuffle();
        return this.targetDeck;
    }

    // Metodo que configura as cartas, deve ser sobrescrito nas classes filhas ao contrário configura para o baralho padrão
    public abstract void SetCardsProperties();
    public void shuffle()
    {
        // depois de embaralhar, a distribuiçao deve iniciar em deck[ 0 ] novamente

        // para cada implementation1.Card, seleciona outro implementation1.Card aleat�rio e os compara
        var deck = this.targetDeck.getDeck();
        for (int first = 0; first < deck.size(); first++)
        {
            // seleciona um numero aleatorio entre 0 e o tamanho do deck
            int second =  new Random().nextInt(this.targetDeck.getNumberOfCards());

            // compara implementation1.Card atual com implementation1.Card aleatoriamente selecionado
            Card temp = deck.remove(second);
            deck.add(0, temp);
        } // for final
    } // fim do método shuffle
}
