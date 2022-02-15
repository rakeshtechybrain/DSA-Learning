import java.time.chrono.MinguoChronology;

public class trapWater {

    public static void main(String[] args) {
        int [] input=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int totalUnitWater=getMaxWaterTrap(input);

        System.out.println(totalUnitWater);
    }


    private static int getMaxWaterTrap(int[] input) {
        int maxTrapWater=0;
        int[] leftMax=new int[input.length];
        int[] rightMax=new int[input.length];
        int lIndex=1;
        int rindex=input.length-2;
        leftMax[0]=input[0];
        rightMax[input.length-1]=input[input.length-1];
        int lmaximum=input[0];
        int rMaximum=input[input.length-1];

         for(int i=1;i<input.length;i++){
              lmaximum= Math.max(input[i],lmaximum);
             leftMax[lIndex++]=lmaximum;
         }
        for(int i=input.length-2;i>=0;i--){
            rMaximum= Math.max(input[i],rMaximum);
            rightMax[rindex--]=rMaximum;
        }
            for(int i=0;i<input.length;i++){
                int x= Math.min(leftMax[i],rightMax[i])-input[i];
                maxTrapWater=maxTrapWater+x;
            }


     return maxTrapWater;
    }
}
