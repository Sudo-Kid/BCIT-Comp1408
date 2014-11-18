
/**
 * Write a description of class LoopPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopPlay
{
    // instance variables - replace the example below with your own
    private InputReader temp;

    /**
     * Constructor for objects of class LoopPlay
     */
    public LoopPlay()
    {
        temp = new InputReader();   
    }

    /**
     * @param timesToLoop used to determine the number of times to ask for new numbers
     */
    public void findHighestNumber(int timesToLoop)
    {
        if(timesToLoop < 0) {
            System.out.println("Your number is to low try again and feel bad!!");
        } else {
            System.out.println("Repeating " + timesToLoop + " times!");
        }

        int highestNumber = 0;
        int userInput;
        while(timesToLoop > 0) {
            
            System.out.print("Enter a whole number: ");
            userInput = temp.getInput();
            
            if(userInput > highestNumber) {
                highestNumber = userInput;
            }

            timesToLoop--;
        }

        System.out.println("Finished lopping! Highest is " + highestNumber);
    }
}
