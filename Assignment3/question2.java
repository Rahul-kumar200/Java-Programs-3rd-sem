package Assignment3;
import java.util.Scanner;

public class question2 {
    
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);

        System.out.print("Enter the number of minutes : ");
        double min=in.nextDouble();

        int days=(int)(min/(60*24));

        int years=(int)(days/365);

        days%=365;

        System.out.println("Years : " + years);
        System.out.println("Days : " + days);

        in.close();
    }
}
