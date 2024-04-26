import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.println("Enter the input by user:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //n=any number
        System.out.println("Using loop:");
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        } 
        

    }
}
