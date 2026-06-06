import java.util.*;
public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println("\nProduct " + i);
            System.out.print("Enter current stock: ");
            int currentStock = sc.nextInt();
            System.out.print("Enter minimum required stock: ");
            int minimumStock = sc.nextInt();
            if (currentStock < minimumStock) {
                int requiredStock = minimumStock - currentStock;
                System.out.println("Restock needed for Product " + i);
                System.out.println("Required stock: " + requiredStock);
            } else {
                System.out.println("Total no of product need to be restocked " + i);
            }
            
            i++;
        }
        sc.close();
    }
}
