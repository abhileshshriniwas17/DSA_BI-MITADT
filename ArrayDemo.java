public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = {110,225,336,225,110,99,88,77,66,55};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int thirdSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            if (num < smallest) {
                thirdSmallest = secondSmallest;
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                thirdSmallest = secondSmallest;
                secondSmallest = num;
            } else if (num < thirdSmallest && num != secondSmallest && num != smallest) {
                thirdSmallest = num;
            }
        }

        System.out.println("Second Largest Number = " + secondLargest);
        System.out.println("Third Smallest Number = " + thirdSmallest);
    }
}