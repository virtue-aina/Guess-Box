import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

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
        boolean gameOn = true;

        while (gameOn) {

            out.println("Hi again, Guess a number from zero to your set limit ");
            int guessedNumber = sc.nextInt();
            if (guessedNumber < limit) {
                if (randomNumber > guessedNumber) {
                    out.println("Close! Hint: It's higher!");
                } else if (randomNumber < guessedNumber) {
                    out.println(" Try again, it is lower!");
                } else  {
                    System.out.println("You are Correct! ");
                    gameOn = false;
                }
            } else {
                out.println("Please guess number within the limits! ");

            }

        }

    }


//    String proceed = sc.next("yes");
//    String stop = sc.next("no");
//    System.out.println("Would you like to restart game? yes or no ");
    // proceed;
    // stop;

    // if (proceed){}
    // else{}

//    System.out.println("");
//     int proximity = Math.abs(randomNumber - guessedNumber);
    //     String str = str.equalsIgnoreCase();
    // LinkedList<String> valueList = new LinkedList<String>();
    //  add.ValueList(guessedNumber);
    //    lastGuessedNumber = valueList.getLast();
    //


    //newGuessedValue = guessedValue
    //check if the newguessed value is close to random number

}









