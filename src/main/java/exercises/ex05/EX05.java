package exercises.ex05;

import java.util.Scanner;

public class EX05 {

    public static void main(String[] args) {

        System.out.print("What is the first number? ");
        String a = getString();

        System.out.print("What is the second number? ");
        String b = getString();

        double doubleA = Double.parseDouble(a), doubleB = Double.parseDouble(b);

        System.out.print(
                a + " + " + b + " = " + (doubleA + doubleB) + "\n" +
                a + " - " + b + " = " + (doubleA - doubleB) + "\n" +
                a + " * " + b + " = " + (doubleA * doubleB) + "\n" +
                a + " / " + b + " = " + (doubleA / doubleB) + "\n"
        );

    }
    
    public static boolean isNum(String str) {

        try {
            double num = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            System.out.println("Enter a valid number!");
            return false;
        }

        return true;
    }

    public static String getString() {
        String str;
        boolean define;
        do {
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            define = isNum(str);
        } while (!define);
        return str;
    }
}
