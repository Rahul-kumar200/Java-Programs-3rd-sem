package Assignment2;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {

    public static void main(String[] args) {
        
        String[] choices={"Rock","Paper","Scissor"};

        Scanner in=new Scanner(System.in);
        Random ran= new Random();
        
        int totalComputer=0;
        int totalPlayer=0;

        int play=0;

        while(play==0)
        {
            String computerChoice= choices[ran.nextInt(choices.length)];    // computer choice

            System.out.print("Enter the choice (Rock, Paper, Scissor) : ");

            String playerChoice=in.next();

            if(playerChoice.equals("Rock")||playerChoice.equals("Paper")||playerChoice.equals("Scissor"))
            {

            if ((computerChoice.equals("Rock") && playerChoice.equals("Scissor"))
                    || (computerChoice.equals("Paper") && playerChoice.equals("Rock"))
                    || (computerChoice.equals("Scissor") && playerChoice.equals("Paper"))) {
                System.out.println("You lose ," + " Computer : " + computerChoice + " " + " You :" + playerChoice);
                totalComputer++;
            }

            else if (computerChoice.equals(playerChoice)) {
                System.out.println("Tie ," + " Computer : " + computerChoice + " " + " You :" + playerChoice);
            }

            else {
                System.out.println("You Win ," + " Computer : " + computerChoice + " " + " You :" + playerChoice);
                totalPlayer++;
            }

            System.out.print("Want to quit and see the result , Press 1 to quit otherwise Press 0 to continue : ");
            play=in.nextInt();

            }
            else
            {
                System.out.println("Please Enter a appropriate choice");
            }
            
        }


        if(totalComputer>totalPlayer)
        {
            System.out.println("You Lose the Game 😔😔 ");
        }
        else if(totalComputer<totalPlayer)
        {
            System.out.println("You Win the Game 🎉🎉 ");
        }
        else
        {
            System.out.println("Game Ties 🙂🙂");
        }

        in.close();
        
    }
}
