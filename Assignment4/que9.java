package Assignment4;

import java.util.*;

public class  que9 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string which you want to trim  : ");
        String str=sc.nextLine();

        String trim_str=str.trim();   // inbuilt function is used here

        System.out.print("Trimmed String :"+ trim_str);

        sc.close();
    }
}
