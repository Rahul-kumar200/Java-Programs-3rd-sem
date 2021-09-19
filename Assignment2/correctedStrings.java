package Assignment2;
import java.util.Scanner;

public class correctedStrings {

    public static void main(String[] args) {
        
    Scanner in=new Scanner(System.in);

    System.out.print("Enter the string : ");
    String str=in.nextLine();
    
    char[] st = str.toCharArray();
    
    for(int i=0;i<str.length();i++)
    {
        if(st[i]==',')
        {
            st[i]=':';
        }
    }

    String corrected=new String(st);

    System.out.println("Corrected String is :" + corrected);

    in.close();
    }
}
