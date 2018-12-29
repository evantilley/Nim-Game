/* Evan Tilley
 * elt2141
 * Zipcode.java - Objects of this
 * class represent a human player
 */
 
import java.util.Scanner;
//declaring instance variables and objects
public class Human
{   
    private int choice; //declares an integer representing the human's move
    private Scanner input; //declares a Scanner object

    //constructor method
    public Human(){
        input=new Scanner(System.in); //instantiates Scanner object
        choice = -1; //initializes choice to "dummy" value
    }
    
    //method that allows the human to enter a move
    public void move(){
    System.out.println("Enter a number of marbles to remove: ");
    choice = input.nextInt(); //updates choice to the value of the user input  
    }
    
    //method that returns the user's choice
    public int getChoice(){

        return choice;   
    }
}
