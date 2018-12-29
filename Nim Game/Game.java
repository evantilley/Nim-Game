/* Evan Tilley
 * elt2141
 * Game.java - Objects of this
 * class are used to play the Nim game
 */

//declaring instance variables and objects
public class Game
{   
    private Human humanPlayer; //Declaring a Human object
    private Computer computerPlayer; //Declaring a Computer object
    //Declaring a variable pile, which represents the number of marbles in the game
    private int pile;
    
    //constructor method
    public Game(int difficulty) //difficulty specifies how the computer plays
    {
        //the game starts with a random number of marbles between 10 and 100
        pile = (int)(Math.random() * ((100 - 10) + 1)) + 10; //initializing pile
        //instantiating computer and human objects
        computerPlayer = new Computer(difficulty);
        humanPlayer = new Human();    
    }
    
    //method that plays the game 
    public void play(){
       //randomly generates 0 or 1 to decide if the computer or player moves first
       int firstMove =  (int) Math.round(Math.random()); 
        
       if (firstMove == 0)
       {
           playComputerFirst(); //the computer moves first
       }
       else
       {
           playHumanFirst(); //the human moves first
       }        
           }
    
    //method to update the number of marbles in the pile
    public void updatePile(int marbles)
    {
        pile = pile-marbles; //updates number of marbles in the pile
        System.out.println("There are " + (pile) + " marbles in the pile.");
    }
    
    //method that allows a human to take a valid move
    public void humanMove()
    {
        humanPlayer.move(); //the human moves
          if(pile!=1)
          {
              //keep prompting the human for another move, as long as the move is invalid
          while (humanPlayer.getChoice() > pile/2 || humanPlayer.getChoice() <=0)
           {
               System.out.println("You must take no more than half "
                                  + "the pile and no less than 1 marble!");
               humanPlayer.move();
          }
          System.out.println("You removed " + humanPlayer.getChoice() + " marbles.");
           
           }       
    }
    
    //method that plays the game if the Computer moves first
    public void playComputerFirst()
    {
        {
           System.out.println("The computer goes first!");
           System.out.println("There are " + (pile) + " marbles in the pile.");
            
           while(pile>0) //continue playing as long as there are still marbles left
           {
           computerPlayer.move(pile); //Computer player makes a move
           updatePile(computerPlayer.getChoice()); //update pile
               
           if(pile == 0)
           {
               //if there are 0 marbles in the pile after the computer moves, it loses
               System.out.println("You win!");
           }

           if (pile>0) //continue playing while there are still marbles in the pile
           {              
            humanMove(); //Human player makes a move
            updatePile(humanPlayer.getChoice()); //update pile
           
           if(pile == 0)
               {
                   //if there are 0 marbles in the pile after the human moves, it loses
                   System.out.println("You lose!");
               }
           }
           }
                  }
    }
    
    //method that plays the game if the human moves first
    public void playHumanFirst()
    {
        System.out.println("You go first!");
           System.out.println("There are " + (pile) + " marbles in the pile.");
        
           while(pile>0) //continue playing as long as there are still marbles left
           {  
           humanMove(); //Human player makes a move
           updatePile(humanPlayer.getChoice()); //update pile
           if(pile == 0)
           {
               //if there are 0 marbles in the pile after the human moves, it loses
               System.out.println("You lose!");
            }

          if(pile>0) //continue playing while there are still marbles in the pile
          {
           computerPlayer.move(pile); //Computer player makes a move
           updatePile(computerPlayer.getChoice()); //update pile
           if(pile == 0)
           {
               //if there are 0 marbles in the pile after the computer moves, it loses
               System.out.println("You win!");

           }   
    }
    
}}}