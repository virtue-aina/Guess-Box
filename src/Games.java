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
<<<<<<< HEAD

        System.out.println("Thanks for playing!");
    }







=======
>>>>>>> d26fc19bc1ff58543b0c4331565f67ea27a33cfb
    public static  void guessAnAnimal(){}
    public static void guessAColour(){
        out.println("Hi. Guess a colour!");
        Scanner sc = new Scanner(System.in);
        Options.Colour ans = Options.Colour.returnRandom();
        String answer = ans.toString();
        boolean solved = false;

        while (!solved){
            String guess = sc.next();
            if (quitGame(guess)){
                solved = true;
            } else if (!guess.equalsIgnoreCase("q")){
                if(guess.equalsIgnoreCase(answer)){
                    solved = true;
                    out.println("You've gotten it correct: "+ answer +". Would you like to go again? [Y/N]");
                    String again = sc.next();
                    if (again.equalsIgnoreCase("y")){
                        guessAColour();
                    }
                } else if (guess.equalsIgnoreCase("h")){
                    out.println("Here's a hint for you");
                    out.println("This is a "+ans.getProperties() + " colour");
                } else {
                    out.println("Wrong lol. Try Again!");
                }
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
            if (quitGame(guess)){
                solved = true;
            } else if (!guess.equalsIgnoreCase("q")) {
                if(guess.equalsIgnoreCase(answer)){
                    solved = true;
                    out.println("You've gotten it correct: "+ answer +". Would you like to go again? [Y/N]");
                    String again = sc.next();
                    if (again.equalsIgnoreCase("y")){
                        guessAShape();
                    }
                } else if(guess.equalsIgnoreCase("h")){
                    out.println("Here's a hint for you");
                    out.println("The shape has "+ ans.getSides() + " sides");
                } else {
                    out.println("Wrong lol. Try Again!");
                }
            }
        }
    }
    public static boolean quitGame(String ans){
        boolean quit = false;
        if (ans.equalsIgnoreCase("q")){
            out.println("Are you sure you want to quit this game? [Y/N]");
            Scanner sc = new Scanner(System.in);
            String confirm = sc.nextLine();
            if (confirm.equalsIgnoreCase("Y")){
                out.println("See you later");
                quit = true;
            } else {
                out.println("Okay. Back to the game!");
            }
        }
        return quit;
    }
}