package calculator;

import java.util.Scanner;

public class Div {
    public static void main(String[] args) {

    }

    public static void div() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value = ");
        int a = sc.nextInt();
        System.out.print("Enter the second value = ");
        int b = sc.nextInt();
        int div = a / b;
        System.out.println("The division is = " +div);
    }
}
