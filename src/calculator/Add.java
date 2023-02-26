package calculator;

import java.util.Scanner;

public class Add {
    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value = ");
        int a = sc.nextInt();
        System.out.print("Enter the second value = ");
        int b = sc.nextInt();
        int add = a + b;
        System.out.println("The addition is = " + add);
    }
}
