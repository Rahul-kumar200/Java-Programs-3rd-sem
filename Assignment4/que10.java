package Assignment4;
import java.util.*;

public class que10 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int count0=0,count2=0,count4=0,count6=0,count8=0;

        int num=1;
        while(num!=-1)
        {
            System.out.print("Enter the number between 10 to 100 having even digits : ");
            num= sc.nextInt();

            if((num/10==0||num/10==2||num/10==4||num/10==6||num/10==8)&&num%2==0)
            {
                int rem;

                while(num!=0)
                {
                    rem=num%10;

                    if(rem==0)
                    count0++;
                    else if(rem==2)
                    count2++;
                    else if(rem==4)
                    count4++;
                    else if(rem==6)
                    count6++;
                    else if(rem==8)
                    count8++;

                    num=num/10;
                }
            } 
            
            else
            {
                System.out.println("ERROR !! Condition not satisfied ");
                break;
            }
        }

        System.out.println("Number of zeros use : " +count0);
        System.out.println("Number of tw0 use : " +count2);
        System.out.println("Number of four use : " +count4);
        System.out.println("Number of six use : " +count6);
        System.out.println("Number of eight use : " +count8);

        sc.close();
    }   
}
