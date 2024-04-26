package Array_1D;

import java.util.Scanner;

public class BinaryNumber {
    public static int DecimaltoBinary(int n){
        int r;
       int sum=0;
       int count=0;
        while(n!=0){
            r=n%2;
            n=n/2;
            sum+=r*Math.pow(10,count);
            count++;
        }
        return sum;

   
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any Decimal Number :");
        int n=sc.nextInt();
        System.out.printf("Decial Number %d is convert to the binary Number = ",n);
       System.out.println(DecimaltoBinary(n));


    }
}
