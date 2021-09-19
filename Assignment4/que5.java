package Assignment4;
import java.util.*;

public class que5 {
    
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the range of numbers : ");
    int r1=sc.nextInt();
    int r2=sc.nextInt();

    System.out.print("Enter the number with which founded numbers are divisible : ");
    int div_num=sc.nextInt();

    for(int i=r1;i<=r2;i++)
    {
        if(i%div_num==0)
        {
            System.out.print(i + "  ");
        }
    }

    sc.close();

    }
}
