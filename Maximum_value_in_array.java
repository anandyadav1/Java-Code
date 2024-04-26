public class Maximum_value_in_array {
    public static void main(String[] args) {
        int [] arr={4, 56, 23, 785, 5467};
        int max=0;
        for(int element: arr) {
            if(element>max) {
                max= element;
            }
        }
        System.out.println("The value of maximum element in this array:\n" +max);
        
    }
}
