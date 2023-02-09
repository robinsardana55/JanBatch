package JAVA;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number x = ");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("your number is even " + x);
        } else {
            System.out.println("It is an odd number " + x);
        }
    }
}
