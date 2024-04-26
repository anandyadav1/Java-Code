public class Prs_methhod_overloading {
    static void foo() {
        System.out.println("Good morning bro!");
    }
    static void foo(int a) {
        System.out.println("Good mornig " +a + " bro!");
    }
    static void foo(int a, int b) {
        System.out.println("Good mornig " + a +" bro!");
        System.out.println("Good mornig " + b +" bro!");
    }
   public static void main(String[] args) {
   foo();
   foo(3000);
   foo(3000, 4000);
   foo(9000, 89000);
   }
}
