public class rainWaterTrapping {

    public int rainWaterTraping(int[] height){
        int ans=0;

        //left array
        int [] left=new int[height.length];
        left[0]=height[0];
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        int [] right=new int [height.length];
        right[right.length-1]=height[height.length-1];
        for (int j=right.length-2;j>=0;j--){
            right[j]=Math.max(right[j+1],height[j]);

        }
        for(int k=0;k<height.length;k++){
            ans+=Math.min(right[k],left[k])-height[k];
        }







        return ans;
    }



}
