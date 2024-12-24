import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int hiddenNumber = 97;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number: ");
        int guessedNumber = sc.nextInt();

        if (guessedNumber < hiddenNumber) {
            System.out.println("More");
        } else if (guessedNumber > hiddenNumber) {
            System.out.println("Less");
        } else {
            System.out.println("You guessed!");
        }
    }
}
