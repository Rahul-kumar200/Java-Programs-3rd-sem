package Assignment2;
import java.util.Scanner;

public class totalInMiligram {

    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);

        System.out.print("Enter the Kilogram value : ");
        int kg=in.nextInt();
        System.out.print("Enter the Gram value : ");
        int g=in.nextInt();
        System.out.print("Enter the Milligramgram value : ");
        int mg=in.nextInt();

        System.out.println(" Value of weight in milligram is : " +(100000*kg+100*g+mg));

        in.close();

    }
    
}
