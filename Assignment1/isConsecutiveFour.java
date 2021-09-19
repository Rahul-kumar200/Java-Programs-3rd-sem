package Assignment1;
import java.util.Scanner;

public class isConsecutiveFour {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = in.nextInt();

        int[] arr=new int[size];

        for(int i=0 ;i<arr.length;i++)
        {
            System.out.print("Enter the "+ (i+1) + " element : ");
             arr[i]=in.nextInt();
        }

        boolean result= isConsecutive(size, arr);
        
        if(result==true)
        System.out.print("The list has consecutive fours");
        
        else
        System.out.print("The list has no consecutive fours");

        in.close();

    }

    public static boolean isConsecutive(int size, int[] arr)
    {
        for(int i=0;i+3<size;i++)
        {
            if(arr[i]==arr[i+1]&&arr[i+1]==arr[i=2]&&arr[i+2]==arr[i+3])
            return (true);
        }

        return(false);

    }
}
