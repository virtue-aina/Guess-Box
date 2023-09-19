import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Games  {


    public static void guessANumber() {
        Scanner sc = new Scanner(System.in);
        Random rando = new Random();
        boolean proceed = true;

        while (proceed) {
            System.out.println("Hi, Please choose a limit for the numbers you want to guess: ");
            int limit = sc.nextInt();

            int randomNumber = rando.nextInt(limit);

            while (true) {
                System.out.println("Guess a number from 0 to " + limit + ": ");
                int guessedNum = sc.nextInt();

                if (guessedNum <= limit) {
                    if (randomNumber == guessedNum) {
                        System.out.println("Correct! " + guessedNum + " is the answer! Play again? [Y/N]:");
                        String restart = sc.next();
                        if (restart.equalsIgnoreCase("N")) {
                            proceed = false;
                        } else if (!restart.equalsIgnoreCase("Y")) {
                            System.out.println("Invalid input. Please enter 'Y' to play again or 'N' to quit.");
                        }
                        break; // Exit the inner loop
                    } else {
                        System.out.println("Incorrect! Try again.");
                    }
                } else {
                    System.out.println("Please guess a number within the set limits.");
                }
            }
        }

        System.out.println("Thanks for playing!");
    }







    public static  void guessAnAnimal(){}


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

    public static void guessAShape(){
        out.println("What shape am I?");
        Scanner sc = new Scanner(System.in);
        Options.Shapes ans = Options.Shapes.returnRandom();
        String answer = ans.toString();
        boolean solved = false;
        //"press h for hint". hint will tell number of sides
        while (!solved){
            String guess = sc.next();
            if(guess.equalsIgnoreCase(answer)){
                solved = true;
                out.println("You've gotten it correct: "+ answer +". Would you like to go again? [Y/N]");
                String again = sc.next();
                if (again.equalsIgnoreCase("y")){
                    guessAShape();
                }
            } else {
                out.println("Wrong lol. Try Again!");
            }
        }
    }
}