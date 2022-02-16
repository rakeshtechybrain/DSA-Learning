public class FindDulicateNumber {

    public static void main(String[] args) {
        int[] input = {1, 3, 4, 2, 2};
        int duplicate = findDuplicate(input);
        System.out.println(duplicate);
    }

    private static int findDuplicate(int[] input) {
        int[] check = new int[input.length];  //[0,-1,-1,0,0.] [1,2,2,3,4]
        int i=0;
        while(check[input[i]] == 0) {
            check[input[i]] = -1;
            i++;
        }
        return input[i];



    }

}
