import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Games  {
    public static void guessANumber() {

        Scanner sc = new Scanner(System.in);//scanner takes input
        Random rando = new Random(); // picks a random int within set limit
        boolean proceed = true;//runs game loop

            while (proceed) {
                out.println("Hi, Please choose a limit to the numbers you want to guess: ");//prompt 1
                int limit = sc.nextInt(); //init for user-defined limit
                int randomNumber = rando.nextInt(limit); //sets random number within user-defined limit

                while(true) {
                     out.println(" Guess a number less than set limit: "); // prompt 2
                     int guessedNum = sc.nextInt();

                     if (guessedNum <= limit) { //checks if input is within limit
                         if (randomNumber == guessedNum) {// check if random number is equal to guessed number
                             out.println("Correct! " + guessedNum + " is the answer! Play again? [Y/N]:"); // prompt 3
                             String restart = sc.next();//restarts game
                             if (!restart.equalsIgnoreCase("Y")) {
                                 proceed = false;
                                 break;
                             } else {
                                guessANumber();//restart
                             }
                         } else {
                             out.println("Incorrect! Try again");
                         }
                     } else {
                         out.println(" Please, use guess within the set limits ");// throws error message and do not start
                     }
                 }
            }

        }
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