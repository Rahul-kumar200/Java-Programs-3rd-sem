package Assignment4;
import java.util.*;

public class que11 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[5];

        for(int i=0;i<5;i++)
        {
            System.out.print("\nEnter the "+ (i+1) + " value of range 10 to 100 : ");
            arr[i]=sc.nextInt();

            if(arr[i]>=10&&arr[i]<=100)
            {
                System.out.print("All unique value till now are : ");
                for(int j=0;j<=i;j++)
                {
                    int count=0;
                    for(int k=j;k>=0;k--)
                    {
                        if(arr[j]==arr[k])
                        count++;
                    }
                    if(count==1)
                    System.out.print(arr[j]+"   ");
                }
            }

            else
            {
                System.out.print("Entered value is out of the range. ");
                System.exit(0);
            }
        }

        sc.close();
    }
}
