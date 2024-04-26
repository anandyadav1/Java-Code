package Array_1D;

public class SubArray {

    public static void PrintSubArray(int numbers[]) {
        int TS = 0;
        for (int i = 0; i <= numbers.length; i++) {
            int start = i;
            for (int j = i; j <= numbers.length; j++) {
                int end = j;
                TS++;
                // System.out.print("{ ");
                for (int k = start; k < end; k++) {
                 System.out.print(numbers[k] +"  ");
                }
                // System.out.print("}");
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("TotalSubArray = " + TS);
    }

    public static void main(String[] args) {
        int numbers[] = { 3, 5, 6, 8, 3, 8, 9, 3, 2, 1, 8 };
        PrintSubArray(numbers);
    }
}
