public class sum_natural_number_Recursion {
    //  static int addAnand(int n) {
    static void addAnand(int n) {
     int sum=0;
     for(int i=1; i<=n; i++) {
     sum=sum+i;
     }
    //  return sum;
     System.out.println("The natural value of sum fun: " +sum);
     }

  //  static int addAnand(int n) {

  //      if (n == 1) 
  //        return 1;
  //      } else {
  //          return n + addAnand(n - 1);
  //      }
  //  }

    public static void main(String[] args) {
        addAnand(5);
        // System.out.println("the natural value of sum: "+ addAnand(6));
        // System.out.println("  The sum of the natural number: " + addAnand(3));
    }
}
