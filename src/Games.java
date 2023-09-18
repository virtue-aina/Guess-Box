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
        //init for us


    }

    public static void guessAColour(){
        out.println("Hi. Guess a colour!");
        Scanner sc = new Scanner(System.in);
        String answer = Options.Colour.returnRandom().toString();
        boolean solved = false;

        while (!solved){
            String guess = sc.next();
            if(guess.equalsIgnoreCase(answer)){
                solved = true;
                out.println("You've gotten it correct: "+ answer +". Would you like to go again? [Y/N]");
                String again = sc.next();
                if (again.equalsIgnoreCase("y")){
                    guessAColour();
                }
            } else {
                out.println("Wrong lol. Try Again!");
            }
        }
    }
}