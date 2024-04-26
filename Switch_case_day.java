import java.util.Scanner;
public class Switch_case_day {
    public static void main(String[] args) {
        System.out.println("Enter the number for day:");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch (day) {
        case 1-> System.out.println("Sunday");
        case 2-> System.out.println("Monday");
        case 3-> System.out.println("Tusday");
        case 4-> System.out.println("Wednesday");
        case 5-> System.out.println("THursday");
        case 6-> System.out.println("Friday");
        case 7-> System.out.println("Satrday");
        }


    }
}
