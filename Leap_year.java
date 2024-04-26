import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args) {
        System.out.println("Enter the input User: ");
        Scanner sc=new Scanner(System.in);
        int year =sc.nextInt();
        if((year%4==0&&year%4!=0)||(year%400==0)) {
            System.out.println("This year is leap year:");
        }
        else {
            System.out.println("This year is not leap year:");


        }
    }
    
}
