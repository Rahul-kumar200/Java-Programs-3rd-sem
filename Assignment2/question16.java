package Assignment2;
import java.util.Scanner;

public class question16 {
    
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);

        System.out.printf("Enter the number : ");
        int upto=in.nextInt();

        int sum=0;

        if(upto<2)
        {
            System.out.print(" Please enter a value greater than 2 ");
            System.exit(0);
        }

        for(int i=4;i<upto;i+=2)
        {
            sum+=i;
        }

        System.out.println("Sum of the number between 2 and "+ upto +" is : " + sum);

        in.close();

    }
}
