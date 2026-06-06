import java.util.*;

public class parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parking hours: ");
        double hours = sc.nextDouble();

        double bill = 0;

        if (hours <= 2) {
            bill = hours * 100;
        } else if (hours <= 5) {
            bill = (2 * 100) + ((hours - 2) * 50);
        } else {
            bill = (2 * 100) + (3 * 50) + ((hours - 5) * 10);
        }

        System.out.println("Total bill = " + bill);

        sc.close();
    }
}