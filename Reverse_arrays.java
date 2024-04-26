public class Reverse_arrays {
    public static void main(String[] args) {
        int [] arr={ 1, 2, 3, 4, 5, 6, 7};
        System.out.println("Without revers arry:");
        for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]);
        }
         System.out.println(" ");
         System.out.println("Reverse order printig by array: ");
          for(int i=arr.length-1; i>0; i--) {
         System.out.print(arr[i]);
        }
        
    }
}
