package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int PrintFact(int n) {
        if (n == 0) {
            return 1;
        }
        // int m=PrintFact(n-1);
        // int factn=n*m;
        
        int factn = n* PrintFact(n - 1);
            return factn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Einter the any number :");
        int n = sc.nextInt();
        System.out.printf("Factorial number of %d! =  ", n);
        System.out.println(PrintFact(n));

    }
}
