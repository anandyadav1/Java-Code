package Array_1D;

public class ReverseArray {
    public static void Reverse(int number[]){
        int firsrt=0;
        int last=number.length-1;
        while(firsrt<last){
            int temp=number[firsrt];
            number[firsrt]=number[last];
            number[last]=temp;
            firsrt++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[]={23, 56, 44, 89, 0, 34,23, 78,90, 67,56, 677};
        
        System.out.print( "Before Revese array = " );
        for(int i=0; i<number.length; i++){
            System.out.print( number[i] +" " );
        }
        System.out.println();
        Reverse(number);
        System.out.print( "After reverse Array = ");
        for(int i=0; i<number.length; i++){
            System.out.print( number[i] +" " );
        }
        System.out.println();

    }
}
