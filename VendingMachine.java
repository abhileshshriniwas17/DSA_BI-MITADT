import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int trayChoice;

        do {
            System.out.println("\n===== VENDING MACHINE =====");
            System.out.println("1. Snacks");
            System.out.println("2. Beverages");
            System.out.println("3. Chocolates");
            System.out.println("4. Exit");
            System.out.print("Select Tray: ");

            trayChoice = sc.nextInt();
            sc.nextLine();

            if (trayChoice == 1) {
                String stay;

                do {
                    System.out.println("\n--- Snacks Tray ---");
                    System.out.println("A. Lays");
                    System.out.println("B. Uncle Chips");
                    System.out.println("C. Doritos");
                    System.out.print("Select Product: ");

                    String product = sc.nextLine();

                    if (product.equalsIgnoreCase("A")) {
                        System.out.println("You selected Lays");
                    } else if (product.equalsIgnoreCase("B")) {
                        System.out.println("You selected Uncle Chips");
                    } else if (product.equalsIgnoreCase("C")) {
                        System.out.println("You selected Doritos");
                    } else {
                        System.out.println("Invalid Product");
                    }

                    System.out.print("Stay on same tray? (yes/no): ");
                    stay = sc.nextLine();

                } while (stay.equalsIgnoreCase("yes"));

            } else if (trayChoice == 2) {
                String stay;

                do {
                    System.out.println("\n--- Beverages Tray ---");
                    System.out.println("A. Coca Cola");
                    System.out.println("B. Pepsi");
                    System.out.println("C. Sprite");
                    System.out.print("Select Product: ");

                    String product = sc.nextLine();

                    if (product.equalsIgnoreCase("A")) {
                        System.out.println("You selected Coca Cola");
                    } else if (product.equalsIgnoreCase("B")) {
                        System.out.println("You selected Pepsi");
                    } else if (product.equalsIgnoreCase("C")) {
                        System.out.println("You selected Sprite");
                    } else {
                        System.out.println("Invalid Product");
                    }

                    System.out.print("Stay on same tray? (yes/no): ");
                    stay = sc.nextLine();

                } while (stay.equalsIgnoreCase("yes"));

            } else if (trayChoice == 3) {
                String stay;

                do {
                    System.out.println("\n--- Chocolates Tray ---");
                    System.out.println("A. Dairy Milk");
                    System.out.println("B. KitKat");
                    System.out.println("C. Five Star");
                    System.out.print("Select Product: ");

                    String product = sc.nextLine();

                    if (product.equalsIgnoreCase("A")) {
                        System.out.println("You selected Dairy Milk");
                    } else if (product.equalsIgnoreCase("B")) {
                        System.out.println("You selected KitKat");
                    } else if (product.equalsIgnoreCase("C")) {
                        System.out.println("You selected Five Star");
                    } else {
                        System.out.println("Invalid Product");
                    }

                    System.out.print("Stay on same tray? (yes/no): ");
                    stay = sc.nextLine();

                } while (stay.equalsIgnoreCase("yes"));

            } else if (trayChoice == 4) {
                System.out.println("Thank You For Using Vending Machine");
            } else {
                System.out.println("Invalid Tray Selection");
            }

        } while (trayChoice != 4);

        sc.close();
    }
}