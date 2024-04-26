package Recursion;

import java.util.Scanner;

public class Increasing_order_number {
    public static void PrintInc(int n){
        if(n==1){
            System.out.print(1+"  ");
            return;

        }
        PrintInc(n-1);
        System.out.print(n+"  ");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the any number :");
        int n =sc.nextInt();
        PrintInc(n);

    }
}
