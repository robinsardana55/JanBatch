package javaa;

import java.util.Scanner;

public class Feb11 {
    public static void main(String[] args) //access specifier return type
    {
        System.out.println("It is all about methods today");

        sum();

    }

    public static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value = ");
        int first = sc.nextInt();
        System.out.print("Enter the second value = ");
        int second = sc.nextInt();
        int sum = first + second;
        System.out.println(sum);
    }
}
