import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the any number :");
    int n =sc.nextInt();
    int t=n;
    int p=n;  //t->temp
    int count=0;
    while(n!=0){
        n/=10;
        count++;
    }
    // int t=n;
    int r,sum=0;
    while(t!=0){
        r=t%10;
        sum+=Math.pow(r,count);
        t/=10;
    }

    if(sum==p){
        System.out.println("Yes");
    }
    else{

        System.out.println("Noo");
    }

        }

    }


    
