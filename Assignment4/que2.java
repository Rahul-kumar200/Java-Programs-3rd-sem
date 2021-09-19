package Assignment4;

import java.util.*;

public class que2 {
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

        int maximum=max(arr,size);
        
        System.out.println("Largest element of the array is : "+ maximum);

        sc.close();
    }

    public static int max(int arr[],int size)
    {
        int max=arr[0];
        for(int i=1;i<size;i++)
        {
            if(max<arr[i])
            max=arr[i];
        }

        return max;
    }
}
