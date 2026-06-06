public class Cinema {
    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 1, 0, 0, 0, 0};

        int max = 0;
        int curr = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                curr++;

                if (curr > max) {
                    max = curr;
                }
            } else {
                curr = 0;
            }
        }

        System.out.println("Maximum consecutive zeros: " + max);
    }
}