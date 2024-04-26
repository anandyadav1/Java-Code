 import java.util.Scanner;
 public class Fibonachi_series_using_function {
    static int fibonachi(int n) {
       //   if (n == 1) {
       //       return 0;
       //   } else if (n == 2) {
       //       return 1;
       //   }
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
    

    public static void main(String[] args) {
        System.out.println("Enter the any number :");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        // System.out.println("This is the fibonachi series: " + fibonachi(1));
        // System.out.println("This is the fibonachi series: " + fibonachi(2));
        // System.out.println("This is the fibonachi series: " + fibonachi(3));
        // System.out.println("This is the fibonachi series: " + fibonachi(4));
        // System.out.println("This is the fibonachi series: " + fibonachi(5));
        // System.out.println("This is the fibonachi series: " + fibonachi(6));
        // System.out.println("This is the fibonachi series: " + fibonachi(n));
        System.out.println("This is the fibonachi series: " + fibonachi(7));
        System.out.println("This is the fibonachi series: " + fibonachi(8));
        fibonachi(n);
    }
}
