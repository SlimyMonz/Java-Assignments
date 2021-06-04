package learning.learning_java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);


        double i1 = getNum(sc);
        double result = addValues(i1, i1, i1, i1);

        System.out.println("The sum of all numbers is: " + result);

    }

    private static int getInt(Scanner sc) {
        System.out.println("Enter an integer: ");
        return sc.nextInt();
    }

    private static double getNum(Scanner sc) {
        System.out.println("Enter a number: ");
        return sc.nextDouble();
    }

    // this allows you to use as many values as you want, check line 13
    private static double addValues(double... values) {
        int result = 0;
        for (var value : values) {
            result += value;
        }
        return result;
    }
}
