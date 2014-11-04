/**
 * This is a class that takes a users input then compares it or displays it in different formats.ue
 * 
 * @author Emett Speer A00735036 
 * @version 1.0
 */
public class StringPlay
{
    // instance variables - replace the example below with your own
    private InputReader reader;

    /**
     * Constructor for objects of class StringPlay
     */
    public StringPlay()
    {
        reader = new InputReader();
    }

    /**
     * Takes the user input and saves to string.
     * Displays the user inputed string to console.
     * Displays the length of the users input.
     * Displays the users input in all uppercase and lowercase.
     */
    public void playWithStrings()
    {
        System.out.print("Type a sentence: ");
        String userInput = reader.getInput();
        System.out.println("You typed: " + userInput);
        System.out.println("Your sentence has " + userInput.length() + " letters.");
        System.out.println("Here it is uppercase: " + userInput.toUpperCase());
        System.out.println("Here it is lowercase: " + userInput.toLowerCase());
    }

    /**
     * Compares 2 strings of user input and outputs if they are the same or different
     */
    public void compareStrings()
    {
        System.out.print("Please enter your first string: ");
        String usersFirstInput = reader.getInput();
        System.out.print("Please enter your second string: ");
        String usersSecondInput = reader.getInput();

        if (usersFirstInput.equals(usersSecondInput)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
