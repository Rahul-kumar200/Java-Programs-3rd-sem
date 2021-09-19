package Assignment1;

import java.util.Scanner;

public class equalArrays {
    public static boolean equals(int[] list1, int[] list2) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1.length; j++) {
                if (list1[i] == list2[j]) {
                    count1++;
                    break;
                }
            }
        }
        for (int i = 0; i < list2.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list2[i] == list1[j]) {
                    count2++;
                    break;
                }
            }
        }
        if (count1 == list1.length && count2 == list2.length) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the lists size:\t");
        int size = s1.nextInt();
        System.out.print("Enter the list 1:\t");
        int[] arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s1.nextInt();
        }
        System.out.print("Enter the list 2:\t");
        int[] arr2 = new int[size];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = s1.nextInt();
        }
        if (arr1.length == arr2.length) {
            if (equals(arr1, arr2)) {
                System.out.println("Two lists are identical");
            } else {
                System.out.println("Two lists are not identical");
            }
        } else {
            System.out.println("Two lists are not identical");
        }
        s1.close();
    }
}
