import java.util.Scanner;
   public class Table_opposit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input by user for table:");
        int n=sc.nextInt();
        System.out.println("Table:");
        for(int i=10; i>=1; i--) {
            int  table =n*i;
            System.out.format( "%d X %d = %d\n",n,i,table);
        }

        
    }
}
