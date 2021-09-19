package Assignment2;
import Assignment2.SalesPerson;
import java.util.Scanner;

public class driver {

    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);

        SalesPerson P1=new SalesPerson();

        System.out.print("Enter the Name , Phone no , District of the salesperson :");
        String name=in.next();
        int phoneNo=in.nextInt();
        String district=in.next();

         P1.SalesPerson(name,phoneNo,district);

        for(int i=0;i<7;i++)
        {
             System.out.print("Enter the amount for the  day no. " + i+" : ");
             int amt=in.nextInt();
             P1.setdailyAmount(i, amt);
        }
        P1.tostring();
        P1.total(); 
        P1.average();

        in.close();
    }

}
