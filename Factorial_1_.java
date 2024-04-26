import java.util.Scanner;
public class Factorial_1_ { 
    public static void main(String[] args) {
        System.out.println("Enter the input by user :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("This is the answer:");
        System.out.print("Factorial(!5)=");
        //int sum=0;
        int fact=1;
        for(int i=1; i<=n; i++){
             fact = fact*i;
            }
            System.out.print(fact);

    }
    
}
