package assignment;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i ;
        }
        System.out.println(sum);

    }

}