package Assignment3;
import java.util.Scanner;

public class question1 {
    
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);

        System.out.print("Enter a number between 1 and 1000 : ");
        int num=in.nextInt();

        int result=1;

        for(int i=0;i<3;i++)
        {
            int rem=num%10;
            num=num/10;
            result*=rem;
        }

        System.out.print("Product of digits is " + result);

        in.close();

    }

}
