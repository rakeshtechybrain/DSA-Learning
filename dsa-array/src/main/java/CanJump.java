public class CanJump {


    public static void main(String[] args)
    {
        int [] intput ={2,3,1,1,4};
        boolean reached=jump(intput);
        System.out.println(reached);
    }

    private static boolean jump(int[] intput) {
        int reachable=0;//to store the maximum index to which we can jump

        for(int i=0;i<intput.length;i++)
        {
            if(i>reachable)//if i comes beyond our reach
                return false;
            reachable=Math.max(reachable,i+intput[i]);
        }

        return true;
    }

}
