public class MinMax {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15, 3, 25};

        int max = arr[0];
        int smax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        int tmin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }

            if (arr[i] < min) {
                tmin = smin;
                smin = min;
                min = arr[i];
            } else if (arr[i] < smin && arr[i] != min) {
                tmin = smin;
                smin = arr[i];
            } else if (arr[i] < tmin && arr[i] != smin && arr[i] != min) {
                tmin = arr[i];
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + smax);
        System.out.println("Minimum: " + min);

        System.out.println("Second Minimum: " + smin);
        System.out.println("Third Minimum: " + tmin);
    }
}