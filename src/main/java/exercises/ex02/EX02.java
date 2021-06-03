

package exercises.ex02;

import java.util.Scanner;

public class EX02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the input string? ");

        String userInput = sc.nextLine();

        int stringLength = userInput.length();

        System.out.println(userInput + " has " + stringLength + " characters.");

    }
}
