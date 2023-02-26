package calculator;

import java.util.Scanner;

public class Sub {
    public static void sub() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value = ");
        int a = sc.nextInt();
        System.out.print("Enter the second value = ");
        int b = sc.nextInt();
        int sub = a - b;
        System.out.println("The subtraction is = " + sub);
    }
}
