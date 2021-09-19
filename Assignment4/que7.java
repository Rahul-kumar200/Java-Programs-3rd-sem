package Assignment4;
import java.util.*;

public class que7 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the first string : ");
        String s1=sc.nextLine();

        System.out.print("Enter the second string : ");
        String s2=sc.nextLine();

        if(s1.equals(s2))
        {
            System.out.print("Both Strings are same .");
            System.exit(0);
        }
         int result=s1.compareTo(s2);
       
        if( result<0)
           {
               System.out.print("First string comes first in lexicographically order.");
               System.exit(0);
           }
        if(result>0)
           {
               System.out.print("Second string comes first in lexicographically order.");
               System.exit(0);
           }
    
        sc.close();
    }

}
