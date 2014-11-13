import java.util.ArrayList;

/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck
{
    // instance variables - replace the example below with your own
    private ArrayList<Card> deckOfCards;

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        deckOfCards = new ArrayList<Card>();
    }

    public void addCard(Card cardToAdd)
    {
        deckOfCards.add(cardToAdd);
    }

    public Card takeCard()
    {
        if(!deckOfCards.isEmpty())
        {
            Card cardRemoved = deckOfCards.get(0);
            deckOfCards.remove(0);
            return cardRemoved;
        }

        return null;
    }

    public void showDeck()
    {
        for(Card index : deckOfCards) {
            System.out.println(deckOfCards.description + " of " + deckOfCards.suit)
        }
        System.out.println(deckOfCards)
    }
}
