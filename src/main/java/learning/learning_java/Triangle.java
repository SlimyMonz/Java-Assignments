package learning.learning_java;

import java.util.Scanner;

public class Triangle {

    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double findArea() {

        double s =  ((side1 + side2 + side3) / 2);
        double a = Math.abs((s - side1));
        double b = Math.abs((s - side2));
        double c = Math.abs((s - side3));
        // If s-side(i) = 0; the Triangle is invalid and will return 0.
        return (Math.sqrt((s * a * b * c)));

    }

    public Triangle() { // call this in main to run the function!

        double[] sidesArray = new double[3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i<3; i++) {
            do {
                System.out.println("Enter length of side" + (i+1) + ": ");
                sidesArray[i] = input.nextDouble();
            } while (sidesArray[i] <= 0);
        }

        Triangle triangle1 = new Triangle(sidesArray[0], sidesArray[1], sidesArray[2]);

        double triangleArea = triangle1.findArea();

        System.out.println(triangleArea);
    }

}
