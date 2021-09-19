package Assignment3;
import java.util.Scanner;

public class question4 {
    
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);

        System.out.print("Enter the annual Percentage interest :  ");
        float intRate= (float)(in.nextDouble());

        System.out.print("Enter the balance :  ");
        float bal= (float)(in.nextDouble());

        float interest=bal*(intRate/1200);

        System.out.print("Interest : " + interest);

        in.close();
    }
}
