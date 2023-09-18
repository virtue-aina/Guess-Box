import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Games {


    public static void guessANumber() {

        Scanner sc = new Scanner(System.in);
        Random rando = new Random();

        out.println("Hi, Please choose a limit to the numbers you want to guess, greater than zero ");

        int limit = sc.nextInt();
        int randomNumber = rando.nextInt(limit);
        //boolean gameRunning = false;

        while(){
            out.println("Hi again, Please guess a number between zero and your set limit ");
            int guessedNumber = sc.nextInt();

            if (randomNumber == guessedNumber) {
                out.println("Correct! The answer is " + randomNumber + " ,great job!");
            } else {
                out.println("The number is " + randomNumber + ". Try again, please! ");
            }

            else  if (){

            }
        }

        out.println("Hi again, Please guess a number between zero and your set limit ");
        int guessedNumber = sc.nextInt();

        if (guessedNumber < limit ) {
            if (randomNumber == guessedNumber) {
                out.println("Correct! The answer is " + randomNumber + " ,great job!");
            } else {
                out.println("The number is " + randomNumber + ". Try again, please! ");
            }
        }else {
            out.println("Please guess number within the limits! ");
        }
    }


}
