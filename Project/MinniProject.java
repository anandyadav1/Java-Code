package Project;

import java.util.Scanner;
import java.util.Random;
public class MinniProject {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // int myNumber=(int)(Math.random()*100);
        Random rand=new Random();
        int myNumber=rand.nextInt(100);
        // Random  = new (Random(100));
        int   userNumber;
        do{
            System.out.println("Gues my number :");
            userNumber=sc.nextInt();
            if(userNumber==myNumber){
                System.out.println("woohoo  ..  CORRECT NUMBER :");
            }
            else if(userNumber>myNumber){
                System.out.println("Your number is too large :");
            }
            else{
                System.out.println("Your Number is too small :");
            }
        }while(userNumber>=0);
        System.out.println("My number was :");
        System.out.println(myNumber);
    }
}
