package Assignment2;
import java.lang.Math;
import java.util.Scanner;

public class guessGame {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Game Starts----------");
        int play=1;

        while(play==1)      // condition to exit from the entire game
        {
            int magicNumber=(int)(Math.random()*100+1);
            int chooseNumber;
            int quit=0;
            while(quit==0)               // condition to quit the present game
            {
                System.out.print("Guess the number :");
                chooseNumber=in.nextInt();

                if(chooseNumber==magicNumber)    //number found
                {
                    System.out.println("🎉🎉Congratulation you Win the Game 🎉🎉🎉");
                    break;
                }

                if(chooseNumber!=magicNumber)  // number not found
                {
                    System.out.println("Number not matched , try again😔😔");
                }

                System.out.print("Want to quit this match , if yes press 1 otherwise press 0 : ");
                quit=in.nextInt();

            }

            System.out.print("Want to play a new match , if yes press 1 otherwise press 0 :");
            play=in.nextInt();

            
        }
        if ( play==0)
        {
            System.out.println("------------Game Over---------------");
        }
    
        in.close();
    }

    
}
