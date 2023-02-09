package assignment;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("Enter the desired value ");
        int even, odd;
        even=a.nextInt();
        odd=b.nextInt();

        if (even%2==0){

            System.out.println("The sum of even digits until the input number = ");
        }



        System.out.println("The sum of odd digits until the input number = ");
    }
}
