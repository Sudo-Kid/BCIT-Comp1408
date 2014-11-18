import java.util.Scanner;
/**
* Class InputReader reads user input from the keyboard. 
* @version 2012.06.05
* @author Colleen Penrowley 
*/
public class InputReader
{
 private Scanner scanner;
 /** Create a new InputReader to read user input.
 */
 public InputReader()
 {
 scanner = new Scanner(System.in);
 }
 /**
 * Gets the user's input 
 * @return the user's input as an int
 */
 public int getInput()
 {
 try {
 return scanner.nextInt();
 }
 catch(java.util.InputMismatchException e) {
 System.out.println("Not a number - treating as zero");
 scanner.nextLine(); // clear the buffer
 return 0;
 }
 }
}