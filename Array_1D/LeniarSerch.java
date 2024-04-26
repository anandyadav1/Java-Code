package Array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class LeniarSerch {
    public static int  linearSearch(int marks[], int key){
        for(int i=0; i<marks.length; i++){
            if(marks[i]==key){
                return i;
            }
           
        }
        return -1;
}


    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the any key number :");
        int key=sc.nextInt();

        int marks[]={ 23, 56, 12, 45, 56, 67, 89};
        int index= linearSearch(marks, key);
        if(index== -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("key is at index :" + index);
        }
        Arrays.sort(marks);
        System.out.println("Modified arr[] : " + Arrays.toString(marks));
        System.out.println(marks);

           
    }
}
