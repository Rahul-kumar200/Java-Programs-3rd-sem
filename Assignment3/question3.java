package Assignment3;
import java.util.Scanner;

public class question3 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the weight in pound : ");
        int pound = in.nextInt();
        System.out.print("Enter the height in inches : ");
        int inches = in.nextInt();

        double kg=0.45359237 *pound;
        double meter=0.0254 *inches;

        float bmi= (float)(kg/(meter*meter));

        System.out.print("BMI is : " + bmi);

        in.close();
    }
    
}
