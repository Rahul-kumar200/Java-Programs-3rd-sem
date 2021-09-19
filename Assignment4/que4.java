package Assignment4;
import java.util.*;

public class que4 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.print("Enter the elements of the array : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int result=check(arr,size);

        if(result==1)
        {
             System.out.print("Yes , this array statisfy the condition . ");

        }    
        else
        {
             System.out.print("No , this array not statisfy the condition . ");

        }    
        sc.close();
    }
    
    public static int check(int arr[],int size)     // return 1 for sucess and 0 for fail
    {
        for(int i=0;i<size-2;i++)
        {
            if(arr[i]+1==arr[i+1]&&arr[i+1]+1==arr[i+2])
            {
                return 1;
            }
        }
        return 0;
    }    
}
