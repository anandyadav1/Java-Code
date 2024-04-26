package Pattern;


import java.util.Scanner;
public class pattern_1_ {
    static void pattern2( int n) {
        System.out.println("This is the pattern by user: ");
        for(int i=n; i>=1; i--) {
            for(int j=1; j<i; j++) {
                System.out.print( " Shubham ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the any input by user :");
        int n=sc.nextInt();
        pattern2(n);
        // pattern2(1);
        // pattern2(2);
        // pattern2(3);
        // pattern2(4);
        // pattern2(5);
        // pattern2(6);
        // pattern2(7);
        // pattern2(8);
        // pattern2(9);
        // pattern2(10);
    }
}
