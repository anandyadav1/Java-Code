package Array_1D;


public class Largest {
    public static int Getlargest(int number[]){
        int Largest=Integer.MIN_VALUE;
        int Smallest=Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(Largest<number[i]){
                Largest=number[i];
            }
            if(Smallest>number[i]){
                Smallest=number[i];
            }
        }
        System.out.println("Smallest value = " + Smallest);
        return Largest;
    }
    public static void main(String[] args) {
        int number[]={2,45,67,34,4,78,556,4556,99};
        System.out.println("Largest Number = " +Getlargest(number));

    }
}
