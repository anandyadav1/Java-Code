package Array_2D;

import java.util.Scanner;

public class BinarySearch {
    public static boolean Search(int matrix[][] ,int key){
        int m=matrix.length;
        int  n=matrix[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==key){
                    System.out.println("At found index "+"("+i+","+j+")");
                    return true;
                }
            }

        }
        System.out.println("Not found");
        return false;
    }


    public static void main(String[] args) {
        int matrix[][]=new int[2][3];
        int m=matrix.length;
        int  n=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elment for matrix :");
        //Input
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
         //Output
         for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Eenter the any number for key :");
        int key=sc.nextInt();
        System.out.println(Search(matrix, key));
        // Search(matrix, key);
    }
}
