import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

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
    private static final int TIMES_TO_SHUFFLE = 10;
    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public static final String[] DESCRIPTIONS = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};


    /**
     * Creates new empty deck of cards
     */
    public Deck()
    {
        deckOfCards = new ArrayList<Card>();
    }

    /**
     * Creates a deck of playing cards
     */
    public void loadDeck()
    {
        for(int suits = 0; suits < SUITS.length; suits++) {
            for(int descriptions = 0; descriptions < DESCRIPTIONS.length; descriptions++) {
                addCard(new Card(DESCRIPTIONS[descriptions], SUITS[suits], descriptions));
            }
        }
    }

    /**
     * @param cardToAdd add card to the deck array
     */
    public void addCard(Card cardToAdd)
    {
        deckOfCards.add(cardToAdd);
    }

    /**
     * Used to take the top card from the deck
     */
    public Card takeCard()
    {
        if(!deckOfCards.isEmpty())
        {
            Card cardRemoved = deckOfCards.get(0);
            deckOfCards.remove(0);
            return cardRemoved;
        }

        System.out.println("The deck is empty.");

        return null;
    }

    /**
     * Used to display the deck
     */
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

    /**
     * Used to swap the deck possition of index1 and index2
     * @param index1 Sets the first card to swap
     * @param index2 Sets the second card to swap
     */
    public void swap(int index1, int index2)
    {
        if(index1 >= 0 && index1 < deckOfCards.size()) {
            if(index2 > 0 && index2 < deckOfCards.size()) {
                Collections.swap(deckOfCards,index1,index2);
            }
        } else {
            System.out.println("Your index values don't exsiste please try again!");
        }
    }

    /**
     * This is used to shuffle the deck the 10 times
     */
    public void shuffle()
    {
        int counter = 0;
        Random randomGenerator = new Random();

        showDeck();
        
        while(TIMES_TO_SHUFFLE > counter++) {
            int index1 = randomGenerator.nextInt(deckOfCards.size());
            int index2 = randomGenerator.nextInt(deckOfCards.size());

            swap(index1, index2);

            System.out.println("THIS IS THE END OF THIS SHUFFLE " + counter);
        }
    }
}
