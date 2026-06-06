import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalBill = 0;
        int trayChoice;
        char continueShopping = 'Y';

        while (continueShopping == 'Y' || continueShopping == 'y') {

            System.out.println("\n===== SELECT TRAY =====");
            System.out.println("1. Snacks");
            System.out.println("2. Beverages");
            System.out.println("3. Chocolates");
            System.out.println("4. Exit");
            System.out.print("Enter tray choice: ");
            trayChoice = sc.nextInt();

            if (trayChoice == 4) {
                break;
            }

            char stayInTray = 'Y';

            while (stayInTray == 'Y' || stayInTray == 'y') {

                switch (trayChoice) {

                    case 1:
                        System.out.println("\n--- Snacks Tray ---");
                        System.out.println("1. Chips      Rs.20");
                        System.out.println("2. Kurkure    Rs.25");
                        System.out.println("3. Biscuit    Rs.15");
                        System.out.println("4. Namkeen    Rs.30");

                        System.out.print("Select product: ");
                        int snack = sc.nextInt();

                        switch (snack) {
                            case 1: totalBill += 20; break;
                            case 2: totalBill += 25; break;
                            case 3: totalBill += 15; break;
                            case 4: totalBill += 30; break;
                            default: System.out.println("Invalid choice");
                        }
                        break;

                    case 2:
                        System.out.println("\n--- Beverages Tray ---");
                        System.out.println("1. Tea        Rs.10");
                        System.out.println("2. Coffee     Rs.20");
                        System.out.println("3. Coke       Rs.40");
                        System.out.println("4. Juice      Rs.50");

                        System.out.print("Select product: ");
                        int beverage = sc.nextInt();

                        switch (beverage) {
                            case 1: totalBill += 10; break;
                            case 2: totalBill += 20; break;
                            case 3: totalBill += 40; break;
                            case 4: totalBill += 50; break;
                            default: System.out.println("Invalid choice");
                        }
                        break;

                    case 3:
                        System.out.println("\n--- Chocolates Tray ---");
                        System.out.println("1. Dairy Milk   Rs.40");
                        System.out.println("2. KitKat       Rs.20");
                        System.out.println("3. Perk         Rs.10");
                        System.out.println("4. Five Star    Rs.30");

                        System.out.print("Select product: ");
                        int chocolate = sc.nextInt();

                        switch (chocolate) {
                            case 1: totalBill += 40; break;
                            case 2: totalBill += 20; break;
                            case 3: totalBill += 10; break;
                            case 4: totalBill += 30; break;
                            default: System.out.println("Invalid choice");
                        }
                        break;

                    default:
                        System.out.println("Invalid tray choice");
                        stayInTray = 'N';
                }

                if (stayInTray == 'Y' || stayInTray == 'y') {
                    System.out.print("Stay in same tray? (Y/N): ");
                    stayInTray = sc.next().charAt(0);
                }
            }

            System.out.print("Continue shopping? (Y/N): ");
            continueShopping = sc.next().charAt(0);
        }

        System.out.println("\n===== FINAL BILL =====");
        System.out.println("Total Amount = Rs." + totalBill);

        sc.close();
    }
}