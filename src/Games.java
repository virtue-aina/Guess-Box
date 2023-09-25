import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Games  {
    public static void guessANumber() {
        Scanner sc = new Scanner(System.in);
        Random rando = new Random();
        boolean proceed = true;
        int guessedNum = 0; // Declare guessedNum

        while (proceed) {
            System.out.print("Enter a limit for guessing: ");
            int limit = sc.nextInt();
            int randomNumber = rando.nextInt(limit + 1);
            boolean guessedCorrectly = false;

            while (!guessedCorrectly) {
                System.out.print("Guess a number from 0 to " + limit + ": ");
                //Handle quitting game
                if (quitGame(sc.next())) {
                   proceed = false;
                }
                if (sc.hasNextInt()) {
                    guessedNum = sc.nextInt(); // Update guessedNum inside the if block
                    if (guessedNum < 0 || guessedNum > limit) {
                        System.out.println("Please guess within the set limits.");
                    } else if (guessedNum == randomNumber) {
                        System.out.println("Correct! " + guessedNum + " is the answer.");
                        guessedCorrectly = true;
                    } else {
                        System.out.println("Incorrect! Try again.");
                    }
                } else {
                    // Handle non-integer input (if user enters 'h')
                    String input = sc.next();
                    if (input.equalsIgnoreCase("h")) {
                        if (randomNumber  % 2 == 0) {
                            System.out.println("Hint: The number is even ");
                        } else {
                            System.out.println("Hint: The number is odd ");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a number or 'h' for a hint.");
                    }
                }
            }
            System.out.print("Play again? (Y/N): ");
            String restart = sc.next();
            if (!restart.equalsIgnoreCase("Y")) {
                proceed = false;
            }
        }
        System.out.println("Thanks for playing!");
    }
    public static  void guessAnAnimal(){
        out.println("Guess any Animal!");
        Scanner aniScan = new Scanner(System.in);
        Options.Animal randomGuessAnimal = Options.Animal.returnRand();
        String animalGuess = randomGuessAnimal.toString();
        boolean isLost = true;

        while (isLost) {
            String guessedAnimal = aniScan.next();
            // Check if the player wants to quit
            if (quitGame(guessedAnimal)) {
                isLost = false;
            }

            // Check if the player guessed the correct animal
            else if (guessedAnimal.equalsIgnoreCase(animalGuess)) {
                isLost = false;
                System.out.println("Correct! the animal is: " + guessedAnimal + " ,Would you like to go again? [Y/N]");
                String anotherTry = aniScan.next();
                if (anotherTry.equalsIgnoreCase("y")) {
                    guessAnAnimal(); // Recursive call to play again
                }
            }
            // Check if the player asks for a hint
            else if (guessedAnimal.equalsIgnoreCase("h")) {
                //Handles article for the kingdom String
                String kingdom = randomGuessAnimal.getKingdom().equalsIgnoreCase("Invertebrate" ) ? "an " : "a ";

                System.out.println("Hint: The animal is " + kingdom + randomGuessAnimal.getKingdom() + " and it " + randomGuessAnimal.getMovement());
            }

            // If none of the above conditions match, it's an incorrect guess
            else {
                System.out.println("Wrong answer, please Try Again!");
            }
        }

    }
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
    public static void guessAnAlbum(){
        out.println("Guess the album of the year winner");
        Scanner sc = new Scanner(System.in);
        Options.Album ans = Options.Album.returnRandom();
        String answer = ans.toString();
        boolean solved = false;

        out.println("Firstly, guess the artist");

        while (!solved){
            String artistName = sc.nextLine();
            if (quitGame(artistName)){//quit condition
                solved = true;
            }else if (!artistName.equalsIgnoreCase("q")){
                if(artistName.equalsIgnoreCase(ans.artistName)){ //check if artist is correct

                    out.println("Correct. Now guess which "+ans.artistName+" album it is");
                    while (!solved){
                        String album = sc.nextLine();
                        if (quitGame(album)){// quit condition
                            solved = true;
                        }else if (!album.equalsIgnoreCase("q")) {
                            if(album.equalsIgnoreCase(ans.albumName)){ //check if album name is correct
                                solved = true;
                                out.println("Correct Answer! "+ answer +". Would you like to go again? [Y/N]");
                                String again = sc.next();
                                if (again.equalsIgnoreCase("y")){
                                    guessAnAlbum();
                                }
                            }else if(album.equalsIgnoreCase("h")){
                                out.println("Hint: The album was in the "+ans.decade+"'s");
                            }else {
                                out.println( "Incorrect Album. Try Again!");
                            }
                        }
                    }
                }else if (artistName.equalsIgnoreCase("h")){
                    out.println("Hint: The artist is a "+ans.category);
                }else {
                    out.println("Wrong Artist. Try Again!");
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
    //lower limit for number guessing game
    //maybe add saved history (FileReader like Nonogram. Create  [if none] and then update after every game)
}