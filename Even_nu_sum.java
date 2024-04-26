import java.util.Scanner;
public class Even_nu_sum {
    public static void main(String[] args) {
        System.out.println("Enter the input by user:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+(2*i);
            //sum=sum+((2*i)+1);
        }
        System.out.print("These are sum number:" +sum);
    }
}
