package Array_1D;

import java.util.Scanner;

public class BinarySearch {
    public static int GetIndex(int number[] ,int key){
        int start=0;
        int end=number.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            else if(number[mid]<key){
                //left
                start=mid+1;
            }
            else{
                // Ringht
                end=mid-1;
            }
        }
        return -1;

    }
    
    public static void main(String[] args) {
        int number[]={45,78,34,23,89,90,657};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for key :");
        int key=sc.nextInt();
        System.out.println("Index for key is " + GetIndex(number,key));

    }
}
