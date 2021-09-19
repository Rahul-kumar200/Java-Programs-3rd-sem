package Assignment4;
import java.util.*;

public class que1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arr=new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the "+ (i+1)+" value : ");
            arr[i]=sc.nextInt();
        }

        int count=0;

        for(int i=0;i<size;i++)
        {
            if(arr[i]==0)
            count++;
        }

        for(int i=0;i<size-count;)
        {
            for(int j=0;j<size;j++)
            {
                if(arr[j]==0)
                {
                   continue;
                }
                
                else
                {
                    arr[i]=arr[j];
                    i++;
                }
            }
            break;
        }

        for(int i=size-count;i<size;i++)
        {
            arr[i]=0;
        }

        System.out.println(" New Array : ");
        for (int i=0; i<size; i++)
        System.out.print(arr[i]+" ");

        sc.close();
    }
    
}
