public class prs_star_using_function {
    static void pattern1(int n)  {
        //int n=sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
            pattern1(8);
        
    } 
}
