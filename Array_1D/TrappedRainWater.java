package Array_1D;

public class TrappedRainWater {
    public static int Call(int height[]){
    int n= height.length;
    int leftmax[]=new int[n];
    int rightmax[]=new int[n];


    //find left maximum boundary
   leftmax[0]=height[0];
   for(int i=1; i<n; i++){
       leftmax[i]=Math.max(height[i], leftmax[i-1]);
       
    }

    //find right maximum boundary
    rightmax[n-1]=height[n-1];
    for(int i=n-2; i>=0; i--){
        rightmax[i]=Math.max(height[i], rightmax[i+1]);
    }

    int trappedRainWater=0;
    for(int i=0; i<n; i++){
        int waterlevel=Math.min(leftmax[i], rightmax[i]);
        trappedRainWater+=waterlevel-height[i];
    }

    return trappedRainWater;

    }
    public static void main(String [] args){
        int height[]={5,2,5,9};
        System.out.println(Call(height));
    }
}