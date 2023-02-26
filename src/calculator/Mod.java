package calculator;

import java.util.Scanner;

public class Mod{

    public static void mod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value = ");
        int a = sc.nextInt();
        System.out.print("Enter the second value = ");
        int b = sc.nextInt();
        double mod = a % b;
        System.out.println("The modulus is = " +mod);
    }
}
