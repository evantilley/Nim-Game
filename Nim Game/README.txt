README.txt
Name: Evan Tilley
UNI: elt2141
Assignment: Programming Project 3

===============================================================================
Nim Game
===============================================================================

I decided to initially approach this problem using a top-down approach,
as professor Cannon discussed in class. I wanted to be able to
play the game simply by creating a Game object and making use of
a play method in the Game class. I went through all the methods and objects
that I thought would be necessary, wrote up the code, and realized that
I did not write enough methods. Though the code worked fine and I could play
the Nim game, many of my methods were insanely large. I decided to make more
methods so I could make my existing methods smaller by calling on methods
within methods.

Initially, the play() method of
the Game object was huge, over 100 lines of code. I realized
that this method was not the most appealing.
I wanted to make the play method much smaller, so I created
other methods - playHumanFirst(), playComputerFirst(), humanMove(), and
updatePile(int marbles). These methods prevented my code from being so repetitive,
significantly decreased the length of the play() method, and made my code
look neater overall.

Upon starting this problem, I was confused because I kept trying to
access methods and variables of the Game class inside of my other classes - Human
and Computer. Attempting to do so caused many issues, as I tried to create
new game objects, my code got very messy, and I kept getting tons
of compile errors! After attending Jack's office hours, however, I
realized that I should refer to methods of the Human and Computer classes
inside of the Game class, never the other way around! I also learned that
I should never try and directly access a class' variable in another
class (that's why one declares instance variables as private); if I want
to access a variable from another class, I should create a method within
that class that returns said variable. Then I can call the method and
work with the desired variable.

At the start of this problem, I was also initially unsure of how to
generate random numbers in an efficient way. I needed to generate
either a 0 or 1 randomly, in order to decide if the player or the computer moves first. I found a convenient way to do this on stackoverflow:
Math.round(Math.random()); (https://stackoverflow.com/a/40856398)
I simply had to put (int) in front of this code segment, and then, because of 
the way the round function works, I could generate 0 or 1 randomly. However, I had
another problem. I needed to generate a random number between one
and the (size of the pile of marbles)/2. I found a snippet of code on 
stackoverflow that took advantage of the random class that allowed me to do this: rand.nextInt((max - min) + 1) + min;
(https://stackoverflow.com/a/5887736). I could now generate a 0 or 1
randomly (the equivalent of flipping a coin) to decide which player goes
first, and could also randomly generate a number so a computer playing
randomly could make a valid move.

This project helped me understand how to put together a rather complex, multi-class
code. I now understand the proper uses of classes and their methods,
and feel more confident with Java syntax.


