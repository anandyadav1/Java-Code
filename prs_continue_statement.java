import java.util.Scanner;
public class prs_continue_statement {
    public static void main(String[] args) {
        System.out.println("Using continnue stameent:");
       Scanner sc = new Scanner(System.in);
        System.out.println("ENter the any number:");
       int n=sc.nextInt();
        for(int i=1; i<=n; i++) {
            System.out.println(i);
            if(i==2) {
                System.out.println("Starting loop");
                continue;
            }
        }
    }
}
