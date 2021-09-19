package Assignment2;
import java.lang.Math;

public class trigoFunction {
    
    public static void main(String[] args) {
        
        int degree= (int)(Math.random()*21+20);

        double rad=(22.0*degree)/(7*180);

        System.out.println(rad);

        System.out.println("Value of sin"+degree+ " is " + Math.sin(rad));
        System.out.println("Value of cos"+degree+ " is " + Math.cos(rad));
        System.out.println("Value of tan"+degree+ " is " + Math.tan(rad));

    }


}
