/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package learning.learn_intellij.invoice;


import java.util.Date;

public class Invoice {

    private String title;

    private Date date;

    private double total;

    public Invoice(String title, Date date, double total) {
        this.title = title;
        this.date = date;
        this.total = total;
    }


    @Override
    public String toString() {
        return "Invoice{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", total=" + total +
                '}';
    }
}
