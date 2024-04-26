package Pattern;

import java.util.Scanner;

//Diamond
public class pattern_1_7 {
    // First Half
    public static void Diamond(int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // Second Half

        for (int i = m ; i >= 1; i--) {
            for (int j = 1; j <= m - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any nubmer :");
        int n = sc.nextInt();
        Diamond(n);

    }
}
