import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the day:"); 
    // System.out.println(day);
    String day=sc.next();
    // System.out.println(day);
    switch(day) {
    case "sunday":
    case"saturday":
    System.out.println("This is the weekend day:");
    break;
    case "monday":
    case "tuesday":
    case "wednesday":
    case "thursday":
    case "friday":
    System.out.println("This is the week day:");
    break;
    default:
    System.out.println("Wrong choice:");
    break;
    }
}
}