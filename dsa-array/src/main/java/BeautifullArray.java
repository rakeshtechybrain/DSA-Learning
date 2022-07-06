import java.util.Stack;

public class BeautifullArray {

    public static void main(String[] args) {
        int [] ans={2,1,-4,3,-5,2,6,-3};
       int[] res=beutifullArraY(ans);

       for(int re:res){
           System.out.print(re);
       }
    }


    public static int[] beutifullArraY(int[] arr) {

       // int[] ans = new int[5];
        Stack<Integer> stack = new Stack();

        for (int i = 0; i < arr.length; i++) {

            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                if ((stack.peek() >= 0 && arr[i] >= 0) || (stack.peek() <= 0 && arr[i] <= 0)) {

                    stack.push(arr[i]);
                } else {
                    stack.pop();
                }
            }
        }
        int[] ans = new int[ stack.size()];
       int id= stack.size()-1;

        while(!stack.isEmpty()){
            ans[id--]=stack.pop();
        }


        return ans;
    }
}
