import java.util.HashMap;

public class prefix {
    public static void main(String[] args) {
        int[] arr = {3, -2, 5, -1, 2, -3, 6, -2, 4};
        int k = 7;

        HashMap<Integer, Integer> prefixMap = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;

        prefixMap.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixMap.containsKey(prefixSum - k)) {
                int length = i - prefixMap.get(prefixSum - k);
                maxLength = Math.max(maxLength, length);
            }

            if (!prefixMap.containsKey(prefixSum)) {
                prefixMap.put(prefixSum, i);
            }
        }

        System.out.println("Longest Length = " + maxLength);
    }
}