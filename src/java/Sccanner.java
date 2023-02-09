package java;

import java.util.Scanner;

public class Sccanner {
    public static void main(String[] args) {
        System.out.println("Enter the value for x");
        Scanner value = new Scanner(System.in);
        int x = value.nextInt();

        if (x < 10) {
            System.out.println("The value of x is less than 10");
        } else {
            System.out.println("The value of x is other than the provided input i.e = " + x);
        }
    }
}
