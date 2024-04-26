import java.util.Scanner;

public class Armstrong_Number_ {
     static void Armstrong_number(int n) {
        int t = n;
        int p = n; // t->temp
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        // int t=n;
        int r, sum = 0;
        while (t != 0) {
            r = t % 10;
            sum += Math.pow(r, count);
            t /= 10;
        }
    
        if (sum == p) {
            System.out.println("Yes");
        } else {

            System.out.println("Noo");
        }
        System.out.println("\t");
        // return sum;

    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for a :");
        int a=sc.nextInt();
        System.out.println("Enter the number for b:");
        int b=sc.nextInt();
        System.out.println("Enter the number for c :");
        int c=sc.nextInt();
        System.out.printf("value %d Armstrong :\n",a);
        Armstrong_number(a);
        System.out.printf("value %d Armstrong :\n",b);
        Armstrong_number(b);
        System.out.printf("value %d Armstrong :\n",c);
        Armstrong_number(c);

    }
}
