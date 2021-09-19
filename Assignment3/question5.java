package Assignment3;
import java.util.Scanner;

public class question5 {

    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1=in.nextInt();
        System.out.print("Enter the second number : ");
        int num2=in.nextInt();

        if(num2%num1==0)
        {
            System.out.print("YES , " + num1  + " is a multiple of " +num2);
        }
       else
        {
            System.out.print("NO , " + num1 +" is a multiple of "+num2);
        }

        in.close();
    }
}

