package Array_1D;

public class Sum_marks_arrays {
    public static void main(String[] args) {
     float [] marks={67.8f, 55.8f, 99.6f, 56.9f, 98.6f};
     float sum=0;
     for( float element:marks){  //for each loop
        sum = sum+element;
     }
     System.out.println("These marks have been sum:");
     System.out.println(sum);
    }
}
