package Array_1D;

public class SumOfSubArray_2 {

    public static void PrintSubArray(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // Calculate Prefix Array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;

                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (currentSum > maxSum) {
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("Maximum sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 3, 5, 6, 8, 3, 8, 9, 3, 2, 1, 8 };
        PrintSubArray(numbers);
    }
}
