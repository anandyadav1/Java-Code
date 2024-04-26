import java.util.Scanner;

public class Percentage_by_conndition {
    public static void main(String[] args) {
        System.out.println("Enter the subjject marks:");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the physics marks:");
        ;
        int m1 = sc.nextInt();
        System.out.println("Enter the merks cchemestry:");
        int m2 = sc.nextInt();
        System.out.println("Enter the marka mathematics:");
        int m3 = sc.nextInt();
        float average = (m1 + m2 + m3) / 3.0F;
        System.out.println("This is total percenntage:");
        System.out.println(average);
        if (average >= 41 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("you have been promated:");
        } else {

            System.out.println("You have not been promated:");
        }

    }
}
