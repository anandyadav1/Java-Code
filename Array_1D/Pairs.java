package Array_1D;

public class Pairs {

    public static void PrinPairs(int number[]){
        
        for(int i=0; i<number.length; i++){
            int current= number[i];    //1,2,3,4,5,6,7,8,9
            for(int j=i+1; j<number.length; j++){
                System.out.print("("+ current +"," + number[j] +")" +" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int number[]={0,1,2,3,4,5,6,7,8,9,};
        PrinPairs(number);
    }
}
