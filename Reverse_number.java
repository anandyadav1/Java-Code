import java.util.Scanner;
public class Reverse_number {
    public static void main(String[] args) {
        int rev=0, r;
    System.out.println("Enter the any number :\n");
    Scanner sc = new Scanner (System.in);
    int n=sc.nextInt();
    System.out.println("After reverse :\n");
    while (n != 0)
    {
        r = n % 10;
        n = n / 10;
        rev=rev*10 +r;

    }
    System.out.println(rev);
    }
}

    
