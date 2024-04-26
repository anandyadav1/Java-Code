package Recursion;

import java.util.Scanner;

public class Fibonachee {

    public static int Fibonacheesireas(int n){
        if(n==0 || n==1){
            return n;
        }

        int fibnm1=Fibonacheesireas(n-1);         //nm1 means n-1
        int fibnm2=Fibonacheesireas(n-2);         //nm2 means n-2
        int fibn=fibnm1+fibnm2;
        return fibn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Einter the any number :");
        int n = sc.nextInt();
        System.out.printf("Fibpnachee sireas is %d time = ",n);
        System.out.println(Fibonacheesireas(n));
        System.out.println(Fibonacheesireas(34));
        System.out.println(Fibonacheesireas(35));
    }
}
