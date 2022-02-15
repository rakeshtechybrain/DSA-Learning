public class ContainerWithMostWater {
    public static void main(String[] args) {
                 int [] input=new int[]{1,8,6,2,5,4,8,3,7};
                int maxArea=maxArea(input);
                System.out.println(maxArea);
    }

    private static int maxArea(int[] input) {
        int maxArea=Integer.MIN_VALUE;
        int start=0;
        int end=input.length-1;

        while(start<=end){
            int min=Math.min(input[start],input[end]);
            int area=min*(end-start);
            if(maxArea<area){
                maxArea=area;
            }
            if(min==input[start]){
                start++;
            }
            else{
                end--;
            }


        }
return maxArea;
    }

}
