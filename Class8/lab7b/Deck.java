import java.util.ArrayList;

/**
 * Write a description of class Deck here.
 * 
 * @author Emett Speer A00703536 
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
            System.out.println("You have drawn the " + cardRemoved.getDescription() + " of " + cardRemoved.getSuit());
            deckOfCards.remove(0);
            return cardRemoved;
        }

        System.out.println("The deck is empty.");

        return null;
    }

    public void showDeck()
    {
        if(!deckOfCards.isEmpty()) {
            for(Card index : deckOfCards) {
                System.out.println(index.getDescription() + " of " + index.getSuit());
            }
        } else {
            System.out.println("The deck is empty.");
        }
    }
}
