import java.util.Random;
import java.util.*;
class higherOrLower
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int upperbound = 100;
        int randomAnswer = rand.nextInt(upperbound);
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play higher or lower! Guess a number!");
        int guess = sc.nextInt();
        while (guess != randomAnswer)
        {
            if (guess < randomAnswer)
            {
                System.out.println("Higher! Guess again!");
            }
            else if (guess > randomAnswer)
            {
                System.out.println("Lower! Guess again!");
            }
            guess = sc.nextInt();
        }
        System.out.println("You win! The answer was " + randomAnswer + ".");
    }
}