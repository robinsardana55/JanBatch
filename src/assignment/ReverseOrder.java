package assignment;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        Scanner sc = new Scanner(System.in);

        int n, r;
        System.out.println("Enter any number ");
        n = sc.nextInt();

        while (n > 0) {
            r = n % 10;
            System.out.print(r);
            n = n / 10;
        }
    }

}
