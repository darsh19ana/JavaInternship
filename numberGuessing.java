import java.util.Random;
import java.util.Scanner;

    public class numberGuessing {
        public static void main(String[] args) {
            int secretNumber, guess;
            int attempts = 0;
            int maxAttempts = 5;
            int points = 0;
            int gameno = 1;

            Random random = new Random();
            //Assigning First Random Variable.
            secretNumber = random.nextInt(50) + 1;

            Scanner scanner = new Scanner(System.in);
            System.out.println("*******Welcome to the Number Guessing Game!********");
            System.out.println("I'm thinking of a number between 1 and 50.");
            System.out.println();
            System.out.println("RULES::");
            System.out.println("1.You Only have 5 Attempts to win.\n2.You will be given 10 points on correct Answer.\n3.You will be given 10 points for each correct Answer.");
        while(true) {
            //External Loop for Number of Games To play.
            while (true) {
                //Internal Loop for Attempts.
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                    points += 10;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you have reached the maximum number of attempts.");
                    System.out.println("The secret number was: " + secretNumber);
                    break;
                }
            }
            //Re-Assigning Attempts.
            attempts = 0;
            //Assigning Random variable Again After every game.
            secretNumber = random.nextInt(50) + 1;
            //Condition for playing game Again or not.
            System.out.println("Do you wish to continue the Game: (Y or N)");
            char enter = scanner.next().trim().charAt(0);
            if(enter == 'Y'){
                gameno ++;
                continue;
            }
            else{
                break;
            }
        }
        //Final points after every game.
            System.out.println("Your Points till game number "+gameno+" :: " +points);


        }
    }
