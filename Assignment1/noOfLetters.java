package Assignment1;
import java.util.Scanner;

public class noOfLetters {
     public static void main(String[] args) {
         
        Scanner in= new Scanner(System.in);

        System.out.print("Enter the string : ");
        String st=in.nextLine();
     
        int numberLetters=find_letters_no(st);

        System.out.print("No. of letters in the string : " + numberLetters);
        in.close();
    }

     public static int find_letters_no(String s)
     {      
        int j=0;
         for(int i=0;i<s.length();i++)
         {
             if(s.charAt(i)!=' ')
             {
                j++;
             }
         }

        return(j);
     }
}
