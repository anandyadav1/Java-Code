package Array_1D;

public class SumOfSubArray {

    public static void PrintSubArray(int numbers[]) {
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int currentSum=0;
        for (int i = 0; i <= numbers.length; i++) {
            int start = i;
            for (int j = i; j <= numbers.length; j++) {
                int end = j;
               currentSum=0;
                for (int k = start; k < end; k++) {
                 currentSum +=numbers[k];
                }
                System.out.print(currentSum);
                System.out.println();
            }
            System.out.println();
            if(maxSum<currentSum){
                maxSum=currentSum;
            }

            else if(minSum>currentSum){
                minSum=currentSum;
            }
        }
        System.out.println("Maxisum Sum of subArray = " +  maxSum);
        System.out.println("Maxisum Sum of subArray = " +  minSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 3, 5, 6, 8, 3, 8, 9, 3, 2, 1, 8 };
        PrintSubArray(numbers);
    }
}
