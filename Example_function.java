import java.util.Scanner;
public class Example_function {
 static int sum(int x, int y ) {
    int add=x+y;
    System.out.println(add);
    return add;
    }
    public static void main(String[] args) {
System.out.println("Enter the input by user for a and b: ");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a: ");
    int a=sc.nextInt();
    System.out.println("Enter the value of b: ");
    int b=sc.nextInt();
    System.out.println("Enter the value of a: ");
    int c=sc.nextInt();
    System.out.println("Enter the value of b: ");
    int d=sc.nextInt();
    System.out.println("After sum values: ");
       sum(a, b);
       sum(c, d);
      // System.out.println(sum);
    }
    
}
