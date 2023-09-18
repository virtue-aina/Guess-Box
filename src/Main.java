import java.util.Scanner;

import static java.lang.System.out;

//maybe add saved history (FileReader like Nonogram. Create  [if none] and then update after every game)

public class Main {
    public static void main(String[] args) {
        menu();
       // Games.guessAColour();
        //Games.guessANumber();
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
                //out.println("you picked 1");
                Games.guessANumber();
                menu();
            }
            case "2" -> {
                Games.guessAColour();
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
}