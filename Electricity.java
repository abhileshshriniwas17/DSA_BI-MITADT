import java.util.*;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = (100 * 1.5) + ((units - 100) * 2.5);
        } else {
            bill = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 5);
        }

        bill = bill + 50;

        if (bill > 2000) {
            bill = bill + (bill * 0.10);
        }

        System.out.println("Electricity Bill = " + bill);

        sc.close();
    }
}