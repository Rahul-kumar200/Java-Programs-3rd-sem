package Assignment1;
import java.util.Scanner;

public class securitySociety {
    public static int vdtssn(String s1){
        if((s1.length()==11) && (s1.charAt(0)>'0' && s1.charAt(0)<='9') &&
        Character.isDigit(s1.charAt(1)) && Character.isDigit(s1.charAt(2)) && 
        s1.charAt(3) == '-' && Character.isDigit(s1.charAt(4)) && 
        Character.isDigit(s1.charAt(5)) && s1.charAt(6) == '-' &&
        Character.isDigit(s1.charAt(7)) && Character.isDigit(s1.charAt(8)) && 
        Character.isDigit(s1.charAt(9)) && Character.isDigit(s1.charAt(10))){
            return 1;
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter the SSN:\t");
        String str= s1.nextLine();
        if((vdtssn(str))==1){
            System.out.println("Valid SSN");
        }
        else{
            System.out.println("Invalid SSN");
        }
        s1.close();
    }
    
}
