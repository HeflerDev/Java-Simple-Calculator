package calculator;

import java.util.Scanner;

public class Dialog {
    public static char getOperator() {
        boolean loop = true;
        char result = '.';

        while (loop) {
            System.out.println("1.Multiply a Value.");
            System.out.println("2.Divide a Value.");
            System.out.println("3.Sum a value.");
            System.out.println("4.Subtract a value");
            Scanner input = new Scanner(System.in);

            switch (input.nextInt()) {
                case 1 -> {
                    result = '*';
                    loop = false;
                }
                case 2 -> {
                    result = '/';
                    loop = false;
                }
                case 3 -> {
                    result = '+';
                    loop = false;
                }
                case 4 -> {
                    result = '-';
                    loop = false;
                }
                default -> System.out.println("\n --Invalid Input-- \n");
            }
        }
        return result;
    }

    public static double getNumber() {
        System.out.println("Select a number.");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}
