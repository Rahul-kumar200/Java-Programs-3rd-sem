package Assignment4;
import java.util.Scanner;

public class que8 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the first string : ");
        String s1=sc.nextLine();

        System.out.print("Enter the second string : ");
        String s2=sc.nextLine();

        if(s1.contains(s2))
        {
            System.out.print("Yes second string is a part of first string .");
        }
        else
        {
            System.out.print("No second string is not a part of first string .");
        }

        sc.close();
    }

    
}
