import java.util.HashMap;

public class Subarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int k = 6;

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;

        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (map.containsKey(prefixSum - k)) {
                System.out.println(k);
                return;
            }

            map.putIfAbsent(prefixSum, i);
        }

        System.out.println("Not Found");
    }
}