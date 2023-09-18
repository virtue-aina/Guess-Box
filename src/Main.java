import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;
//create menu. include "0 to exit"
//add multiple games. maybe different kind of guessing scenarios
//number game
//color
//animal
//shapes
//album of the year winner
//quit at any point
//maybe add saved history (FileReader like Nonogram. Create  [if none] and then update after every game)
public class Main {
    public static void main(String[] args) {
        guessANumber();
    }

    public static void guessANumber() {

        Scanner sc = new Scanner(System.in);
        Random rando = new Random();

        out.println("Hi, Please choose a limit to the numbers you want to guess, greater than zero ");
        Scanner limitScn = new Scanner(System.in);
        int limit = limitScn.nextInt();
        int randomNumber = rando.nextInt(limit);

        while(limit > 1){
            out.println("Hi again, Please guess a number between zero and your set limit ");
            int guessedNumber = sc.nextInt();

            if (randomNumber == guessedNumber) {
                out.println("Correct! The answer is " + randomNumber + " ,great job!");
            } else {
                out.println("The number is " + randomNumber + ". Try again, please! ");
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



// as long as input is below limit
//accept input compare with correct answer
//if wrong ask user to try again and start from the beginning
// if user is correct congratulate user!


