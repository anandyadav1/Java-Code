import java.lang.String;

public class prs_arrays_example {
    public static void main(String[] args) {
        System.out.println("Printing increasing order by using for loop:");
        System.out.println("");
          String[] famialy1 = { "Jeeta yadav", "Dhanauti devi", "Sarita yadav", "Prins yadav", "Anand yadav",
                "Roshani yadav", "Shubham yadav" };
        for (int i = 0; i < famialy1.length; i++) {
            System.out.println(famialy1[i] );
        }
        System.out.println(" Printing revers order by using for loop:");
        System.out.println("");
        String[] famialy2 = { "Jeeta yadav", "Dhanauti devi", "Sarita yadav", "Prins yadav", "Anand yadav",
                "Roshani yadav", "Shubham yadav" };
        for (int i = famialy2.length-1 ; i >= 0; i--) {
            System.out.println(famialy2[i]);
        }
    }
}
