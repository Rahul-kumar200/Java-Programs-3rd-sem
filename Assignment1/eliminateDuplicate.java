package Assignment1;
import java.util.Scanner;

public class eliminateDuplicate {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int[] arr=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter the " + (i+1)+" integers : ");
            arr[i]=in.nextInt();
        }
        
        eliminateDuplicates(arr);

        in.close();
    
    }

    public static void eliminateDuplicates(int[] arr)   //function 
    {
        int[] temp_arr=new int[10];
        int count=0;   
        for (int i=0;i<10;i++) 
        {
            int j;
           for( j=0;j<i;j++)
           {
              if(arr[j]==arr[i])
              break; 
           }
           if(j==i)
           {
                temp_arr[count]=arr[i];
                count++;
           }
        }
        System.out.println("Array having eliminated elements : ");
        for (int i=0;i<count;i++) {
            System.out.print(temp_arr[i]+"  ");
        }
    }

}


