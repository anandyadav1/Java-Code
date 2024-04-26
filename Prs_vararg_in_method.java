public class Prs_vararg_in_method {
    static int sum(int ...arr) {
        // Avallable as int [] arr;
        int result = 0;
        for (int a: arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
System.out.println("The sum of 7 and 9 value = " + sum(7,9));      
System.out.println("The sum of 7 and 9, 6, value = " + sum(7,9,6));      
System.out.println("The sum of 7 and 9, 2, 9 value = " + sum(7,9,2,9));      
System.out.println("The sum of 7 and 9,5, 2, 7 value = " + sum(7,9,5,2,7));      
System.out.println("The sum of 7 and 9, 8, 9, 1, 4 value = " + sum(7,9,8,9,1,4));      
System.out.println("The sum of 7 and 9 value = " + sum(7,9));      

    }
}
