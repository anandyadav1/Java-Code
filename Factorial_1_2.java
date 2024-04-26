import java.util.Scanner;

public class Factorial_1_2 {

    /*
    Binomial Coefficient
     * n
     *  c     = !n / !r * !(n-r)
     *    r
     */

     public static int Factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
             fact = fact*i;
            }
            // System.out.print(fact);
            return fact;

     }

    public static void BinomialCoeff( int n, int r){
        int fact=1;
        
           int x = Factorial(n);
            int y = Factorial(r);
            int z = Factorial(n-r);

             fact= fact * x/(y*z);

             System.out.println("Binomial Coefficient of " +n +"  and  "+ r+ "  = " +  fact);
   
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value for Fctorial :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        BinomialCoeff(a,b);
        
    }
}
