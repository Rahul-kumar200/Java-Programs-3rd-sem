package Assignment2;
import java.util.Scanner;
import Assignment2.Duration;

public class DurationTest {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        
        Duration D1=new Duration();

        System.out.print("Enter the start Hour and Minute : ");
        int sHr=in.nextInt();
        int sMin=in.nextInt();

        System.out.print("Enter the end Hour and Minute : ");
        int eHr=in.nextInt();
        int eMin=in.nextInt();

        D1.setter(sHr, sMin, eHr, eMin);
        D1.tostring();
        System.out.println("\nLength of Duration is : " + D1.length()+"min");

        in.close();
    }
}
