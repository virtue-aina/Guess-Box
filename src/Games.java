import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Games {


    public static void guessANumber() {

        Scanner sc = new Scanner(System.in);
        //scanner takes input

        Random rando = new Random();
        // picks a random int within set limit

        out.println("Hi, Please choose a limit to the numbers you want to guess, greater than zero ");
        //prompt 1

        int limit = sc.nextInt();
        //init for user-defined limit

        int randomNumber = rando.nextInt(limit);
        //sets random number within user-defined limit

          if(randomNumber < limit && randomNumber > 0){
         //checks if input is within limit (and above zero)

              out.println(" Guess a number between zero and limit ");
             // prompt 2
              int  guessedNum = sc.nextInt();
              if(randomNumber == guessedNum){
                  out.println("Correct! " + guessedNum + " is the answer! Play again? [Y/N]" );
              = sc.next("y");

              }


              // check if random number is equal to guessed number


          }
          else{

              out.println(" Please, use guess within the set limits ");
              // throws error message and do not start
          }



        //if so do-----

        // if equal, congratulate
        // check if wrong, if true ask to try again
        // if farther than answer,  cooler
        // if closer than answer, warmer
        // ask if the player wants to play again only if game is won
        // if player wants to restart ---- viable at any point.
        // if player want to exit ------viable at any point



    }
}
