package Pattern;



import java.util.Scanner;

//Hollow Rhombus

public class pattern_1_6 {
    public static void SolidRhombus(int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == m || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number : ");
        int n = sc.nextInt();
        SolidRhombus(n);
    }
}
