
public class SubarrayCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 5;

        int count = countSubarrays(arr, k);
        System.out.println("Count = " + count);
    }

    static int countSubarrays(int[] arr, int k) {
        int left = 0;
        int sum = 0;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }
}