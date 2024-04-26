public class Multi_diam_arrays {
    public static void main(String[] args) {
        System.out.println("Hii");
        int [][] flats; //2-D array
        flats = new int[2][3];
        flats [0][1]=101;
        flats [0][2]=102;
        flats [0][3]=103;
        flats [1][1]=201;
        flats [1][2]=202;
        flats [1][3]=203; 
        for(int i=0; i<flats.length; i++) {
            for(int j=0; j<flats[i].length; j++) {
                System.out.println(flats[i][j]);
               System.out.println("");
            }
            System.out.println("\n");
        }
    }
}
