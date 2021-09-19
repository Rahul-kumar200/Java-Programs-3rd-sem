package Assignment2;
import java.util.Scanner;

public class totalMoney {

    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);

        System.out.print("Enter the total no of pennie coins : ");
        int pen=in.nextInt();
        System.out.print("Enter the total no of nickle coins : ");
        int nickle=in.nextInt();
        System.out.print("Enter the total no of dimes coins : ");
        int dim=in.nextInt();
        System.out.print("Enter the total no of quarter coins : ");
        int que=in.nextInt();

        int totalCents=pen+5*nickle+10*dim+25*que;

        int dollar=totalCents/100;
        int cent=totalCents%100;

        System.out.println("Total Amount------------------");
        System.out.println("Dollar : " + dollar);
        System.out.println("Cents : " + cent);

        in.close();

    }
    
}
