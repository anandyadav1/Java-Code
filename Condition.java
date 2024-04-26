import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
                
        System.out.println("Enter the input by user:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        if(age>18) {
            System.out.println("You can drive :");
        } 
        else {
            System.out.println("You can not drive");
        }
    }
}
