/* Evan Tilley
 * elt2141
 * Computer.java - Objects of this
 * class represent a computer player
 */

//declaring instance variables
public class Computer
{    
    private int mode; //declaring mode (difficulty)
    private int choice; //declaring computer's choice

    //constructor method
    public Computer(int m)
    {
        //initializing mode and choice
        mode = m;
        choice = -1; //-1 is a "dummy" value
    }
    
    //method that allows computer to move
    public void move(int marblesLeft)
    {
        if (mode==1) //if difficulty = 1, "stupid" computer
        {
            //choose a random number of marbles between 1 and (marbles left)/2 to remove
            int random = (int)(Math.random() * ((marblesLeft/2 - 1) + 1)) + 1;
            choice = random;
        }
        
        if (mode==2) //if difficulty = 2, "smart" computer
        {
            //if marbles left is a power of 2 minus 1, choose a
            //random amount of marbles between 1 and (marbles left)/2 to remove
            if (marblesLeft == 3 || marblesLeft == 7 || +
                marblesLeft == 15 || marblesLeft == 31 || marblesLeft == 63)
            {
                int random = (int)(Math.random() * ((marblesLeft/2 - 1) + 1)) + 1;
                choice = random;

            }
            //"else if" statements specify the smartest move,
            //based off of hard-coded values
                        
            else if(marblesLeft>=64)
            {
                choice = -(63-marblesLeft);
            }
 
            else if (marblesLeft>= 32)
            {
                 choice = -(31-marblesLeft);
            }
            
            else if (marblesLeft>=16)
            {
                choice  = -(15-marblesLeft);
            }
            
            else if (marblesLeft>=8)
            {
                choice = -(7-marblesLeft);
            }
            
            else if (marblesLeft>=4)
            {
                choice = -(3-marblesLeft);
            }
            
            else if (marblesLeft==2)
            {
                choice = 1;
            }              
            }
            
         System.out.println("The computer removed " + getChoice() + " marbles.");
    }
                
    //method that returns the computer's choice     
    public int getChoice(){
        return choice;
    }   
}
