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
        //first prompt

        int limit = sc.nextInt();
        //init for user-defined limit

        int randomNumber = rando.nextInt(limit);
        //init for


    }
}
