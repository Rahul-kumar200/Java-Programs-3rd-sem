package Assignment3;
import java.util.Scanner;

public class question6 {
    
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the integer : ");
        int integer=in.nextInt();

        decimalToBinary(integer);
        decimalToOctal(integer);
        decimalToHexa(integer);
        
        in.close();

    }
    public static void decimalToBinary(int num)
    {
        int[] binary = new int[35];
        int id = 0;
 
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }
 
        // Print Binary
        System.out.print("\nBinary : ");
        print(binary, id);
    }

    public static void decimalToOctal(int num)
    {
        int[] octal = new int[35];
        int id = 0;
 
        while (num > 0) {
            octal[id++] = num % 8;
            num = num / 8;
        }
 
        // Print Octal
        System.out.print("\nOctal : ");
         print(octal, id);
    }

    public static void decimalToHexa(int num)
    {
        char[] Hexadecimal = new char[35];
        int id = 0;
 
        while (num > 0) {
            int rem = num % 16;
            if(rem<10)
            {
            Hexadecimal[id++] = (char)(rem+48);
            }
            else
            {
                Hexadecimal[id++]=(char)(rem+55);
            }
            num = num / 16;
        }
 
        // Print Hexadecimal
        System.out.print("\nHexadecimal : ");
        for (int j = id - 1; j >= 0; j--)
        System.out.print( Hexadecimal[j]);

    }

    static void print(int[] number, int id)
    {

        for (int i = id - 1; i >= 0; i--)
            System.out.print(number[i] + "");
    }
}
