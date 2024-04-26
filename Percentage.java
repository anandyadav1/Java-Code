import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        System.out.println("Enter the input five subject by  user:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks subject 1:");
        float a = sc.nextFloat();
        System.out.println("Enter the marks subject 2:");
        float b = sc.nextFloat();
        System.out.println("Enter the marks subject 3:");
        float c = sc.nextFloat();
        System.out.println("Enter the subjekt 4:");
        float d = sc.nextFloat();
        System.out.println("Enter the subjekt 5:");
        float e = sc.nextFloat();
        System.out.println("percentage:");
        float sum = a + b + c + d + e;
        float percentage = (sum / 500) * 100;
        System.out.println(percentage);

   sc.close();
 }

}
