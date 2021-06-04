/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package learning.learn_intellij;


import learning.learn_intellij.invoice.Invoice;
import learning.learn_intellij.person.Person;

import java.util.Date;

public class Main {

    public static void main(String[] args)  {

        var invoice = new Invoice("My invoice", new Date(), 123.45);

        System.out.println(invoice);

        var person = new Person("Harry", "Hocker", 27);

        System.out.println(person);

        System.out.println("Everything works!");

    }

}

