package Pattern;



import java.util.Scanner;

//Solid Rhombus

public class pattern_1_5 {
public static void SolidRhombus(int m){
    for(int i=1; i<=m; i++){
        for(int j=1; j<=m-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=m; j++){
            System.out.print("*");
        }
        System.out.println("");
    }

}

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the any number : ");
        int n=sc.nextInt();
        SolidRhombus(n);
    }
}
