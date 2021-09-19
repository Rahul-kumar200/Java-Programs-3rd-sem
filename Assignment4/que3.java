package Assignment4;
import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num=sc.nextInt();

        findpalidrome(num);
        sc.close();
    }

    public static void findpalidrome(int num)
    {
        int sum=0,rem,temp=num;
        while(temp!=0)
        {
            rem=temp%10;
            temp=temp/10;
            sum=sum*10+rem;
        }

        if(sum==num)
        System.out.print("Yes , " + num + " is a palindrome  number ");
        else
        System.out.print("No , " + num + " is a not  palindrome  number ");
    }
}
