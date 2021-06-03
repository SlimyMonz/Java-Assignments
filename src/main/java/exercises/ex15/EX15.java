/*
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Harry Hocker
 */

package exercises.ex15;
//yeah, these are necessary
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class EX15 {

    public static Scanner sc = new Scanner(System.in);
    public static Charset charset = StandardCharsets.US_ASCII;

    private static final byte[] password = {98, 117, 116, 116};

    /*
                SECRET PASSWORD: butt
     */

    public static void main(String[] args) {

        System.out.print("Enter the password: ");

        String userInput = sc.nextLine();

        byte[] byteArray = charset.encode(userInput).array();

        /* This was used to test if the arrays were the same.
        System.out.println(Arrays.toString(byteArray));
        System.out.println(Arrays.toString(password));
         */

        if (Arrays.equals(byteArray, password)) {
            System.out.println("Hacker voice: I'm in!");
        } else {
            System.out.println("*Loud Explosion* \"Snake? Snaaake!? SNAAAAAAAAAKE!!!\"");
        }

    }
    /*
    What the hell is this code?
    I transform a user string into an array of bytes and compare it to the password array.
    The password array is just another string converted to bytes, so it can be compared after input is converted!
    In this case, the password array is: butt
     */
}
