package Pattern;

public class pattern_1_3 {

    //Hollow Rectangle

    public static void HollowRectangle(int totalRow ,int totalColmun){
        //Inner loop
        for(int i=1; i<=totalRow; i++){
            //Outerloop
            for(int j=1; j<=totalColmun; j++){
                if(i==1||i==totalRow || j==1||j==totalColmun){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }
    public static void main(String[] args) {
        HollowRectangle(4, 12);
        
    }
}
