import java.util.Scanner;
public class prs_recursion {
//static int factorial_itretive (int n) {
static int factorial_itretive (double n) {
    if(n==0) {
        return 1;
    }
    else {
       // return n * factorial(n-1);

int product =1;
    for( int i=1; i<=n; i++) {
        product *=i;
    }
    return product;

    }

}


public static void main(String[] args) {
    System.out.println("Enter the any number by user: ");
    Scanner sc= new Scanner(System.in);
    int x =sc.nextInt();
    //System.out.println("The value of factorial x is: " + factorial(x));
    System.out.println("The value of factorial x is: " + factorial_itretive(x));

}
}
