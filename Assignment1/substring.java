package Assignment1;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String string1 = s1.nextLine();
        System.out.print("Enter the second string : ");
        String string2 = s1.nextLine();
        findSubstring(string1, string2);
        s1.close();
    }

    public static void findSubstring(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                int k = 0;
                int j = i;
                while (k < s2.length() && (j < s1.length())) {
                    if (s1.charAt(j) != s2.charAt(k)) {
                        break;
                    }
                    k++;
                    j++;
                }

                if (k == s2.length()) {
                    System.out.print("Second string is a substring of the first string");
                    System.exit(0);
                }
            }
        }
        System.out.print("Second string is not a substring of the first string");

    }
}
