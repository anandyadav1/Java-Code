import java.util.Scanner;

public class Sum_table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input by user for table:");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Complete table:");
        for (int i = 1; i <= 10; i++) {
            int table = n * i;
            System.out.format("%d X %d = %d\n", n, i, table);
            sum = sum + table;
        }
        System.out.print("sum of table=");
        System.out.println(sum);
    }
}
