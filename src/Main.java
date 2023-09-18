<<<<<<< HEAD
//create menu. include "0 to exit"
//add multiple games. maybe different kind of guessing scenarios
//number game
//color
//animal
//shapes
//album of the year winner
//quit at any point
=======
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

>>>>>>> dc0e5d4788658d26e1575d6e9a8bbc2d22d9c87f
//maybe add saved history (FileReader like Nonogram. Create  [if none] and then update after every game)

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
         Games.guessANumber();
    }

=======
        menu();
    }

    public static void menu(){
        out.println("--------------");
        out.println("Please select a game you'd like to play!");
        out.println("1. Guess the number");
        out.println("2. Guess the colour");
        out.println("3. Guess the animal");
        out.println("4. Guess the shape");
        out.println("5. Guess the Album of The Year Winner");
        out.println("0. Exit");
        out.println("--------------");
        Scanner sc = new Scanner(System.in);
        String option = sc.next();

        switch (option) {
            case "1" -> {
                out.println("you picked 1");
                menu();
            }
            case "2" -> {
                out.println("you picked 2");
                menu();
            }
            case "3" -> {
                out.println("you picked 3");
                menu();
            }
            case "4" -> {
                out.println("you picked 4");
                menu();
            }
            case "5" -> {
                out.println("you picked 5");
                menu();
            }
            case "0" -> {
                out.println("Thanks for playing!");
                System.exit(0);
            }
            default -> {
                out.println("Incorrect Option. Please Try Again!");
                menu();
            }
        }
    }
    public static void guessANumber() {
>>>>>>> dc0e5d4788658d26e1575d6e9a8bbc2d22d9c87f

}



// as long as input is below limit
//accept input compare with correct answer
//if wrong ask user to try again and start from the beginning
// if user is correct congratulate user!


