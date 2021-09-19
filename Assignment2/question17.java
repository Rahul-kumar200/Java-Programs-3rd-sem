package Assignment2;
import java.util.Scanner;

public class question17 {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter the string  : ");
        String str=in.nextLine();
        System.out.print("Enter the starting Index  : ");
        int startIndex=in.nextInt();
        System.out.print("Enter the delete length  : ");
        int deletelength=in.nextInt();

        String correctedString=splice(str,startIndex,deletelength);   // calling the method

        System.out.println("String after deletion of substring : " + correctedString);

        in.close();
    }

    static String splice(String str,int startingIndex, int deletelength)
    {
        char[] ch=new char[100];

        ch=str.toCharArray();        //converting the given string into a char array

        if(startingIndex<0)
        {
            startingIndex=0;
        }
        int i,j;

        for(i=startingIndex,j=startingIndex+deletelength;j<ch.length;i++,j++)
        {
            ch[i]=ch[j];
            ch[j]='\0';                 // for deletion of extra string
        }

        String correctedString=String.valueOf(ch);    // reversing back char array to the string
    
        return correctedString;
    }
    
}
