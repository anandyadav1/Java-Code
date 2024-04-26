package Array_1D;


public class KadansAlgorithmForSumOfSubarray {


    public static void Kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;          //maximum sum
        int cs=0;                          //current sum
        int n=numbers.length;

        for(int i=0; i<n; i++){
            cs=cs+numbers[i];
            if(cs<0) {
                cs=0;
            }
            ms=Math.max(cs,ms);
        }

        System.out.println("our sum of sub Array = "+ ms);
    
    }
    public static void main(String[] args) {
        // int numbers[]={ -2,6};
        int numbers[]={ -2, -3, 4, -1, -2, 1, 5, -3};
        Kadanes(numbers);

    }
}
