package Array_2D;

import java.util.Scanner;

public class Create_2D_Array {

    public static void main(String[] args) {
        // int matrix[][]=new int[2][3];
        // int m=matrix.length;
        // int n=matrix[0].length;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the elment for matrix :");

        // //Input
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         matrix[i][j]=sc.nextInt();
        //     }
        // }

        // //Output
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println("");
        // }


        int matrix[][]={{11,21,31,41,51,61},{72,82,92,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};
        int m=matrix.length;
        int n=matrix[0].length;
        System.out.println("This is my Matrix :");
        for(int i=0; i<m; i++){
            for(int j=0;j<n; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println("\n");
        }

    }
}
