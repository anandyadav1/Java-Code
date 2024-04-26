import java.util.Scanner;
public class almost_Example_Using_Function {
     public static int add(int a,  int b) {
        int c=a+b;
        System.out.println("these vslue sum:" +c);
        return c;
    }
    public static void main(String[] args) {
        System.out.println("Enter the vlue a and b :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any number:");
        int x=sc.nextInt() ;
        System.out.println("Enter the value of b:");
        int y=sc.nextInt();
        // System.out.println("These value sum" + x, y);
    }


}
