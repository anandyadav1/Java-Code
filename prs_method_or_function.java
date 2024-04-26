public class prs_method_or_function {
static int logic(int x, int y) {
    int z;
    if(x>y){
        z=x*y;
    }
    else {
        z=x+y;
    }
    return z;
}
public static void main(String[] args) {
    
    int a=5;
    int b=6;
    int c;
    c=logic(a, b);
    int a1=6;
    int b1=9;
    int c1;
    c1=logic(a1, b1);
    int a2=87 ,b2=87, c2;
     c2=logic(a2, b2);
    System.out.println(c);
    System.out.println(c1);
    System.out.println(c2);
}
    
}
