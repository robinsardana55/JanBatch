package calculator;

import java.util.Scanner;

public class Mul {
    public static void main(String[] args) {

    }

    public static void mul() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value = ");
        int a = sc.nextInt();
        System.out.print("Enter the second value = ");
        int b = sc.nextInt();
        int mul = a * b;
        System.out.println("The multiplication is = " +mul);
    }
}
