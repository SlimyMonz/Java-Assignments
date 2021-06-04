package learning.learning_java;

public class Month {
    String[] monthName =
                {"January", "February", "March",
                    "April", "May", "June",
                    "July", "August", "September",
                    "October", "November", "December"};
    public Month() {
        for (String months : monthName) { // easy way to print array
            System.out.println(months);
        }
    }

}
