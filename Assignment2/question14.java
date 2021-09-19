package Assignment2;
import java.util.Scanner;

public class question14 {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str=in.nextLine();

        char[] ch=str.toCharArray();

        int count=0;

        // count of 'a' in the string
        for(int i=0;i<str.length();i++)
        {
            if(ch[i]=='a')
            {
                count++;
            }
        }
        System.out.println("'a' occurs : "+count+"times");

        // count of 'e' in the string
        count=0;
        for(int i=0;i<str.length();i++)
        {
            if(ch[i]=='e')
            {
                count++;
            }
        }
        System.out.println("'e' occurs : "+count+"times");

        // count of 'i' in the string
         count=0;
        for(int i=0;i<str.length();i++)
        {
            if(ch[i]=='i')
            {
                count++;
            }
        }
        System.out.println("'i' occurs : "+count+"times");

        // count of 'o' in the string
         count=0;
        for(int i=0;i<str.length();i++)
        {
            if(ch[i]=='o')
            {
                count++;
            }
        }
        System.out.println("'o' occurs : "+count+"times");

        // count of 'u' in the string
         count=0;
        for(int i=0;i<str.length();i++)
        {
            if(ch[i]=='u')
            {
                count++;
            }
        }
        System.out.println("'u' occurs : "+count+"times");


        in.close();

    }

}
