import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Test {

    public static void main(String[] args) {
        int[] data = {4, 5, 1, 3, 2};

        System.out.println(minimumTime(5, data));
    }

    public static int minimumTime(int n, int[] arr) {
        int t=0;

        Queue<Integer> queue= new LinkedBlockingQueue<>();
        List<Integer> list= new ArrayList<>();

        for(int i=0;i<arr.length;i++){

             queue.add(arr[i]);
             list.add(arr[i]);
        }

        Collections.sort(list,(a,b)->a-b);
        int l=0;

        while(!queue.isEmpty()){


            if(queue.peek()==list.get(l)){
                //
                queue.poll();

                l++;

            }
            else{

                queue.add(queue.poll());
            }
        t++;


        }




        return t;

    }










}
