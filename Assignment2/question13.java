package Assignment2;

import java.util.Random;
import java.util.Scanner;

public class question13 {

    public static void main(String[] args) {

        String[] choices = { "Rock", "Paper", "Scissor" };

        Scanner s1 = new Scanner(System.in);
        Random ran = new Random();

        int Count = 0;
        int Count2 = 0;

        int play = 1;

        while (play == 1) {
            String computerChoice = choices[ran.nextInt(choices.length)];
            System.out.print("Enter the choice (Rock, Paper, Scissor) : ");

            String playerChoice = s1.next();

            if ((computerChoice.equals("Rock") && playerChoice.equals("Scissor"))
                    || (computerChoice.equals("Paper") && playerChoice.equals("Rock"))
                    || (computerChoice.equals("Scissor") && playerChoice.equals("Paper"))) {
                System.out.println("You lose ," + " Computer : " + computerChoice + " " + " You :" + playerChoice);
                Count++;
            }

            else if (computerChoice.equals(playerChoice)) {
                System.out.println("Tie ," + " Computer : " + computerChoice + " " + " You :" + playerChoice);
            }

            else {
                System.out.println("You Win ," + " Computer : " + computerChoice + " " + " You :" + playerChoice);
                Count2++;
            }

            System.out.print("Press 1 to continue: ");
            play = s1.nextInt();

        }

        if (Count > Count2) {
            System.out.println("You Lose");
        } else if (Count2>Count) {
            System.out.println("You Win");
        } else {
            System.out.println("It's a Tie");
        }
        s1.close();
    }
}