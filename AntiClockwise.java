public class AntiClockwise {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 2;

        System.out.print("Initi
        
        
        al: ");
        printArray(arr);

        for (int r = 1; r <= k; r++) {
            int last = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;

            System.out.print("After " + r + " rotation: ");
            printArray(arr);
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}