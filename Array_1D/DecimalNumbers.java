package Array_1D;

import java.util.Scanner;

public class DecimalNumbers {

     public static int  BinarytoDecimal(int  n){
        int  sum=0;
        int  r;    //r=Remainder
        int  count=0;
        while(n!=0){
            r=n%10;
            n/=10;
            sum+=r*Math.pow(2, count);
            count++;
        }
        return sum;
     }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Binary Number :");
        int  n=sc.nextInt();
        System.out.printf("Binary Number %d is convert to the Decimal Number = ",n );
         System.out.println(BinarytoDecimal(n));

        
    }
}
