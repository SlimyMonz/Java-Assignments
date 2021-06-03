package exercises.ex07;

import java.util.Scanner;

public class EX07 {

    static final double convert = 0.09290304;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("What is the length of the room in feet? ");

        int f1 = sc.nextInt();

        System.out.print("What is the width of the room in feet? ");

        int f2 = sc.nextInt();

        System.out.printf("You entered dimensions of %d feet by %d feet.\n", f1, f2);

        double areaFeet = (double) f1 * f2;

        double areaMeters = areaFeet * convert;

        System.out.println("The area is");

        System.out.printf("%.2f square feet.\n", areaFeet);

        System.out.printf("%.3f square meters.", areaMeters);


    }

}
