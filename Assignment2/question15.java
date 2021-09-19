package Assignment2;

import java.util.Scanner;

public class question15 {
    static String pad(String str, int n) {
        int net = n - str.length();
        for (int i = 0; i < net; i++) {
            str += '0';
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the string:\t");
        String str = s1.nextLine();
        System.out.print("Enter the number:\t");
        int n = s1.nextInt();
        System.out.println(pad(str, n));

        s1.close();
    }
}