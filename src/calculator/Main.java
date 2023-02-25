package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;

        do {

            System.out.println(" \n Please choose from one of the following options: \n");

            System.out.println(" 1. Divide ");
            System.out.println(" 2. Multiply ");
            System.out.println(" 3. Addition ");
            System.out.println(" 4. Subtraction ");
            System.out.println(" 5. Modulus ");
            System.out.println(" 6. Exit \n ");
            Scanner sc = new Scanner(System.in);

            int input = sc.nextInt();

            System.out.println("You have selected option = " + input);


            switch (input) {

                default:
                    System.out.println("Goodbye!");

                case 1:
                    Div.div();
                    break;

                case 2:
                    Mul.mul();
                    break;

                case 3:
                    Add.add();
                    break;

                case 4:
                    Sub.sub();
                    break;

                case 5:
                    Mod.mod();
                    break;

                case 6:
                    flag = false;
                    System.out.println("You choose to exit the program. Enjoy the rest of the day! ");
                    break;

            }
        } while (flag != false);

    }
}
