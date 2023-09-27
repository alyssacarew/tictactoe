/* Tic-Tac-Toe Rules:
1. The game is played on a grid 
that's 3 squares by 3 squares.

2. You are X , your friend (or the computer in this case) is O.
Players take turns putting their marks in empty squares.

3. The first player to get 3 of her marks in a row 
(up, down, across, or diagonally) is the winner.

4. When all 9 squares are full, the game is over. 
If no player has 3 marks in a row, the game ends in a tie.

Our Objective:
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
(Make a method to check if game has been won, tied, or hasn't been won yet: 
if won then store winning combination with hyphens around each winning move,
if hasn't been won yet then continue game)

-Print updated grid: if won then make outline for what combination won
(Use earlier method)

-Ask if they'd like to play again: if yes then print repeat game and loser goes first, 
if not then thank for playing and close program
(Loop in main/driver function, close loop and program if they don't want to play again)

-If grid is full, check if game tied: if yes then ask to repeat with random going first,
if not follow rules for if won
(This will be checked for in the check winner method in between moves, use randInt mentioned earlier
Track winner to make loser go first next game)

*/
import java.util.Scanner;
import java.util.Random;

public class tictactoe{
   //Method to print guide grid based on number pad so user knows what number equals what location
   public static void printGuide(){
      System.out.println("[ 7 | 8 | 9 ]");
      System.out.println("-------------");
      System.out.println("[ 4 | 5 | 6 ]");
      System.out.println("-------------");
      System.out.println("[ 1 | 2 | 3 ]");
   }

   //Method to print updated grid
   public static void printGrid(String[] moves){
      System.out.println("[ "+moves[6]+" | "+moves[7]+" | "+moves[8]+" ]");
      System.out.println("-------------");
      System.out.println("[ "+moves[3]+" | "+moves[4]+" | "+moves[5]+" ]");
      System.out.println("-------------");
      System.out.println("[ "+moves[0]+" | "+moves[1]+" | "+moves[2]+" ]");
   }

   //This could be implemented more efficiently
   public static int isGameWon(String[] moves){
      // 012
       if(moves[0] == "X" && moves[1] == "X" && moves[2] == "X"){
         return 1;
       }  
       else if(moves[0] == "O" && moves[1] == "O" && moves[2] == "O"){
         return 2;
       }
       //036
       else if(moves[0] == "X" && moves[3] == "X" && moves[6] == "X"){
         return 1;
       }  
       else if(moves[0] == "O" && moves[3] == "O" && moves[6] == "O"){
         return 2;
       }
       //246
       else if(moves[2] == "X" && moves[4] == "X" && moves[6] == "X"){
         return 1;
       }  
       else if(moves[2] == "O" && moves[4] == "O" && moves[6] == "O"){
         return 2;
       }
       //345
      else if(moves[3] == "X" && moves[4] == "X" && moves[5] == "X"){
         return 1;
       }  
       else if(moves[3] == "O" && moves[4] == "O" && moves[5] == "O"){
         return 2;
       }
       //147
       else if(moves[1] == "X" && moves[4] == "X" && moves[7] == "X"){
         return 1;
       }  
       else if(moves[1] == "O" && moves[4] == "O" && moves[7] == "O"){
         return 2;
       }
       //048
       else if(moves[0] == "X" && moves[4] == "X" && moves[8] == "X"){
         return 1;
       }  
       else if(moves[0] == "O" && moves[4] == "O" && moves[8] == "O"){
         return 2;
       }
       //678
       else if(moves[6] == "X" && moves[7] == "X" && moves[8] == "X"){
         return 1;
       }  
       else if(moves[6] == "O" && moves[7] == "O" && moves[8] == "O"){
         return 2;
       }
       //258
      else if(moves[2] == "X" && moves[5] == "X" && moves[8] == "X"){
         return 1;
       }  
       else if(moves[2] == "O" && moves[5] == "O" && moves[8] == "O"){
         return 2;
       }
       else{
         return 0;
       }
      }

      public static boolean isBoardFull(String[] moves){
         for(int i=0; i<=8; i++){
            if (moves[i] == "_"){
               return false;
            }
         }
         return true;
      } 
   
   //Driver function
   public static void main(String []args) {
      System.out.println("Controls for grid:");
      printGuide();
      Scanner scan = new Scanner(System.in);
      Random rand = new Random();
      boolean boardFull = false;
      System.out.println("Please enter a 1 or 2 to set which player goes first:");
      int playerTurn = scan.nextInt();
      String[] moves = {"_", "_", "_", "_", "_", "_", "_", "_", "_"};
      while(!boardFull){
         int temp;
         if(playerTurn == 1){
            System.out.println("Player 1's turn; enter a number from 1-9 to place an X on the grid:");
            temp = scan.nextInt();
            while((temp > 9) || (temp < 1)){
               System.out.println("Invalid move, try again.");
               temp = scan.nextInt();
            }
            moves[temp-1]="X";
            printGrid(moves);
            playerTurn=2;
            boardFull = isBoardFull(moves);
            if(isGameWon(moves) == 1){
               break;
            }
         }

         else{
            System.out.println("Player 2's turn; enter a number from 1-9 to place an O on the grid:");
            temp = scan.nextInt();
            while((temp > 9) || (temp < 1)){
               System.out.println("Invalid move, try again.");
               temp = scan.nextInt();
            }
            moves[temp-1]="O";
            printGrid(moves);
            playerTurn=1;
            boardFull = isBoardFull(moves);
            if(isGameWon(moves) == 2){
               break;
            }
         }
      }
      if(isGameWon(moves) == 1){
         System.out.println("Player 1 won!");
      }
      else if (isGameWon(moves) == 2){
         System.out.println("Player 2 won!");
      }
      else{
         System.out.println("Game tied.");
      }
   }
 }
