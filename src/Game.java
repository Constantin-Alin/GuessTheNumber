import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random rnd = new Random();
        int lives = 10;
        int counter = 0;
        int hiddenNumber = rnd.nextInt(100);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Guess the number: ");
            int guessedNumber = sc.nextInt();
            counter += 1;

            if (lives == 0) {
                System.out.println("Game over, LOSER");
                break;
            }

            if (guessedNumber < hiddenNumber) {
                System.out.println("More");
                lives -= 1;
            } else if (guessedNumber > hiddenNumber) {
                System.out.println("Less");
                lives -= 1;
            } else {
                System.out.println("You guessed!");
                System.out.println("Attempts used: " + counter);
                break;
            }
        }
    }
}
