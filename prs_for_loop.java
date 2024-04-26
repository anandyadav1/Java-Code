import java.util.Scanner;
public class prs_for_loop { 
    public static void main(String[] args) {
        System.out.println("Enter the input by user:");
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println("Using for loop:");
        System.out.println("Odd number:");
        for(int i=0; i<=n; i++) {
            System.out.println(2*i+1);
            //System.out.println(2*i);

        }
    }
    
}
