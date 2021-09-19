package Assignment1;
import java.util.Scanner;

public class commonPrefix {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first string : ");
        String string1= in.nextLine();

        System.out.print("Enter the second string : ");
        String string2= in.nextLine();

        findCommonPrefix(string1 , string2);

        in.close();
    }

     public static void findCommonPrefix(String s1 , String s2)
    {
        if(s1.charAt(0)!= s2.charAt(0))
        {
            System.out.print("No common prefix" );
        }

        int count=0;

        for(int i=0;i<s1.length()&&i<s2.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            count++;

            else 
            break;

        }

        System.out.print("The common Prefix is :" );

        for(int i=0;i<count;i++)    
        {
            System.out.print(s1.charAt(i));
        }
    }
}
