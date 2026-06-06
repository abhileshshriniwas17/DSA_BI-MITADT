import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int m = sc.nextInt();

        int len = n - m;

        k = (k + 1) % len;

        int[] temp = new int[len];
        int idx = 0;

        for(int i = k; i < len; i++) {
            temp[idx++] = arr[i];
        }

        for(int i = 0; i < k; i++) {
            temp[idx++] = arr[i];
        }

        for(int i = 0; i < len; i++) {
            arr[i] = temp[i];
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}