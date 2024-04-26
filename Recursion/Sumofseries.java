package Recursion;

import java.util.Scanner;

public class Sumofseries {

    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        }

        int s = Sum(n - 1);
        int sum = n + s;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Einter the any number :");
        int n = sc.nextInt();
        System.out.printf("Sum of series for value  %d  =  ", n);
        System.out.println(Sum(n));

    }
}
