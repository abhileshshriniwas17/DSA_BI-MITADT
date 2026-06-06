import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.print("Enter m: ");
        int m = sc.nextInt();

        int len = n - m;

        k = k % len;

        int temp[] = new int[len];

        int index = 0;

        for (int i = k; i < len; i++) {
            temp[index++] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            temp[index++] = arr[i];
        }

        for (int i = 0; i < len; i++) {
            arr[i] = temp[i];
        }

        System.out.println("Output:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);

            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}