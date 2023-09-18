import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

//maybe add saved history (FileReader like Nonogram. Create  [if none] and then update after every game)
public class Main {
    public static void main(String[] args) {
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


