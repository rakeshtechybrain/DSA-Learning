public class Merge2ShortedArray {

    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=(m+n-1);
        while(i>=0 && j>=0){

            if(nums1[i]<nums2[j]){
                nums1[k--]=nums2[j--];
            }
            else{
                nums1[k--]=nums1[i--];
            }

        }

        while(i>=0){
            nums1[k--]=nums1[i--];
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }




    }

    //my approach with merge sort
    public int [] sortedArray(int[]nums1,int []nums2){

        int[] result=new int[nums1.length+nums2.length];
        int ind=0;
        int r=0;
        int l=0;

        while(r<nums1.length && l<nums2.length){


            if(nums1[l]<=nums2[r]){
                result[ind++]=nums1[l++];

            }
            else
            {
                result[ind++]=nums2[r++];
            }
        }

        while(l<nums1.length){
            result[ind++]=nums1[l++];

        }
        while(r<nums2.length){
            result[ind++]=nums2[r++];

        }


        return result;

    }
}
