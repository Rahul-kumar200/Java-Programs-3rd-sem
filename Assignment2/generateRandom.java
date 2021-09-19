package Assignment2;
import java.util.Random;
import java.util.Scanner;

public class generateRandom {
    
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        Random rand= new Random();

        System.out.print("Enter the lower bound : ");
        int min= in.nextInt();
        System.out.print("Enter the Upper bound : ");
        int max= in.nextInt();
    
        int random=(rand.nextInt(max-min+1));
        
        System.out.print("Random number from " + max + " to " + min + " is " + (min+random));
      
        in.close();
    }
}
