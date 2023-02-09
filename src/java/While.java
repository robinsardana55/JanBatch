package java;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        System.out.println("Enter your desired number up to 100 ");
        Scanner table = new Scanner(System.in);
        int x=table.nextInt();
        while (x<=100){
            System.out.println(x + "*" +x+"=" + x*2);
            x++;
        }
    }
}
