import java.util.HashMap;

public class LongestSubarraySumK1 {
    public static void main(String[] args) {
        int[] arr = {3, -2, 5, -1, 2, -3, 6, -2, 4};
        int k = 7;

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println("Lenght of longest subarray = " + maxLen);
    }
}  