import java.util.Scanner;

public class three_number_sum {
    public static void main(String[] args) {
        System.out.println("Taking the input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        float a = sc.nextFloat();
        System.out.println("Enter the number 2");
        float b = sc.nextFloat();
        System.out.println("Enter the number 3");
        float c = sc.nextFloat();
        float sum = a + b + c;
        System.out.print(sum);
    }

}
