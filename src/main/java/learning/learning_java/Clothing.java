package learning.learning_java;

public class Clothing {

    String item;
    String size;
    String color;
    Double price;
    String itemString;

    String template = "Clothing: %s, Size: %s, Color: %s, Cost: $%.2f";

    public Clothing(String item, String size, String color, Double price) {
        this.item = item;
        this.size = size;
        this.color = color;
        this.price = price;
        this.itemString = String.format(template, item, size, color, price);
    }

    public void printClothing() {
        System.out.println(itemString);
    }

}
