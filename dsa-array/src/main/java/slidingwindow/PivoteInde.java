package slidingwindow;

public class PivoteInde {
    public int pivotIndex(int[] A) {
        int left = 0, sum = 0;
        for(int i=0;i<A.length;i++) {
            sum += A[i];
        }
        for(int i=0;i<A.length;i++) {
            sum -= A[i];
            if(sum == left) return i;
            left += A[i];
        }
        return -1;
        // TC : O(N)
        // SC : O(1)
    }
}
