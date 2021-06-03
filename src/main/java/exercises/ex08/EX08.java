package exercises.ex08;

import java.util.Scanner;

public class EX08 {

    public static int slicesPerPizza = 8; // defines slice per pizza

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("How many people? ");
        int people = sc.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizza = sc.nextInt();

        System.out.printf("%d people with %d pizzas.\n", people, pizza);

        int slicesPerPerson = (pizza*slicesPerPizza)/people;

        int remainderSlices = (pizza*slicesPerPizza)%people;

        System.out.printf("Each person gets %d pieces of pizza.\n", slicesPerPerson);
        System.out.printf("There are %d leftover pieces.\n", remainderSlices);

    }
}
