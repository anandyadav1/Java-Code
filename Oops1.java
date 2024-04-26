 import java.util.Scanner;
 class Employee {
    int id; 
    String name;
}

public class Oops1 {
    public static void main(String[] args) {
        Employee Anand = new Employee();
        System.out.println("Enter the input by user ");
        Scanner sc = new Scanner(System.in);
        int id =sc.nextInt();
        // Anand.id = 56;
        Anand.name = "Anand Kumar Yadav";

        // System.out.println(Anand.id)
        System.out.println(Anand.name);
        sc.close();
    
    }
}
