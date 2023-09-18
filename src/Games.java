import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Games {


    public static void guessANumber() {

        Scanner sc = new Scanner(System.in);
        //scanner takes input
        Random rando = new Random();
        // picks a random data


        out.println("Hi, Please choose a limit to the numbers you want to guess, greater than zero ");

        int limit = sc.nextInt();
        int randomNumber = rando.nextInt(limit);



}
