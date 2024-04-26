package Recursion;

import java.util.Scanner;

public class Decreasing_order_number {
    public static void PrintDec(int n){
        if(n==1){
            System.out.println(1);
            return ;
        }
        System.out.print(n+ "  ");
        PrintDec(n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the any number :");
        int n=sc.nextInt();
        PrintDec(n);

        
    }
}
