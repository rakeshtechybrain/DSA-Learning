import java.util.*;

public class PrintCommonElements {

    public static void main(String[] args)
    {
        int mat[][] =
                {
                        {1, 2, 1, 7, 8},
                        {1, 2, 1, 7, 8}

                };

        printCommonElements(mat);
        
        List<List<Integer>> res=new LinkedList<>();
        res.add(Arrays.asList());
        Stack<Integer> stack= new Stack<>();
                stack.pop();

    }

    static int M = 2;
    static int N =5;
    static void printCommonElements(int mat[][])
    {

        Map<Integer,Integer> mp = new HashMap<>();

        if(M==1) {
            for (int j = 0; j <N ; j++){
                System.out.println(mat[0][j]);
            }

        }

        // initialize 1st row elements with value 1
        for (int j = 0; j < N; j++)
            mp.put(mat[0][j],1);

        // traverse the matrix
        for (int i = 1; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                // If element is present in the map and
                // is not duplicated in current row.
                if (mp.get(mat[i][j]) != null && mp.get(mat[i][j]) == i)
                {
                    // we increment count of the element
                    // in map by 1
                    mp.put(mat[i][j], i + 1);

                    // If this is last row
                    if (i == M - 1)
                        System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}
