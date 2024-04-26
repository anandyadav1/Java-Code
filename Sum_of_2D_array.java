public class Sum_of_2D_array {
    public static void main(String[] args) {
        int [][] mat1={{2, 4, 7},
                     {6, 7, 9}};
        int [] [] mat2={{5, 8, 4},
                    {4, 7, 2}};
        int[] [] result={{0, 0, 0},
                      {0, 0, 0}};
        for(int i=0; i<mat1.length; i++)  {
            for(int j=0; j<mat2[i].length; j++){
                System.out.printf("Setting value for i=%d and j=%d\n",i,j);
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }   
        
        for(int i=0; i<mat1.length; i++)  {
            for(int j=0; j<mat2[i].length; j++){
                result[i][j]=mat1[i][j]+ mat2[i][j];
        System.out.print(result[i][j] +" ");
            }
        System.out.println("");
        }
    }
}                