package Assignment1;
import java.util.Scanner;

public class checkPassword {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the password : ");
        String string=in.nextLine();

        verifyPassword(string);
        
        in.close();
    }   

    public static void verifyPassword( String s)   // function to find weather a password is valid or not
    {
        if(s.length()<8)
        {
            System.out.println("Not a valid Password");
            System.exit(0);
        }

        int noDigits=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=48&&s.charAt(i)<=57)
            noDigits++;
        }

        if(noDigits<2)
        {
            System.out.println("Not a valid Password");
            System.exit(0);
        }

        for(int i=0;i<s.length();i++)
        {
            if( !((s.charAt(i)>47&&s.charAt(i)<58)||(s.charAt(i)>64&&s.charAt(i)<91)||(s.charAt(i)>96&&s.charAt(i)<123)))
            {
                System.out.println("Not a valid Password");
                System.exit(0);
            }
        }
       
        System.out.println("Valid Password");
 
    }
}
