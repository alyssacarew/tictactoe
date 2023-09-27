# Tic-Tac-Toe Project in Java
## By Alyssa Carew

### How to run:
With Java installed on your computer, go to the terminal and make the given folder the current directory. Type "javac tictactoe.java" to compile the code then "java tictactoe" to run and play through the terminal. Enjoy!


### Tic-Tac-Toe Rules:
1. The game is played on a grid 
that's 3 squares by 3 squares.
2. You are X , your friend (or the computer in this case) is O.
Players take turns putting their marks in empty squares.
3. The first player to get 3 of her marks in a row 
(up, down, across, or diagonally) is the winner.
4. When all 9 squares are full, the game is over. 
If no player has 3 marks in a row, the game ends in a tie.

### Objective:
-Ask for player's names
(Print question for name, keyboard scanner string to save to name variable)

-Ask player who is going first

-Print out empty grid
(Make a method to do this, print symbols with stored moves in between)

-Ask player for move
(Print question for location of move, store which player went last)

-Check if the move is valid: if it is then continue, if not then loop
(Looping if statement to store move into move variable array if valid, 
and repeat question if not valid)

-Check if someone won, if yes then print winning board and wish congratulations to the player that won,
if not ask for next move and repeat
(Make a method to check if game has been won, tied, or hasn't been won yet: if won then store winning combination with hyphens around each winning move, if hasn't been won yet then continue game)

-Print updated grid: if won then make outline for what combination won
(Use earlier method)

-Ask if they'd like to play again: if yes then print repeat game and loser goes first, 
if not then thank for playing and close program
(Loop in main/driver function, close loop and program if they don't want to play again)

-If grid is full, check if game tied: if yes then ask to repeat with random going first,
if not follow rules for if won
(This will be checked for in the check winner method in between moves, use randInt mentioned earlier
Track winner to make loser go first next game)
