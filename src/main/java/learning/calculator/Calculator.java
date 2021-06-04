package learning.calculator;

public class Calculator {

    public double addNumbers(double... args) {
        int total = 0;
        for (double value : args) {
            total += value;
        }
        return total;
    }



}
