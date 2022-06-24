import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BinaryTreeApplicationClient {


    public static void main(String[] args) {




        BinaryTreeNode root=new BinaryTreeNode();
        Address empAddfree=new Address("India","delhi","West",
                "UttamNage",110059);

        Set<String> mobile=new HashSet<>();
         mobile.add("9717811110");

        Employee emp=new Employee(1001,"Rakesh Sinha","SUB1",empAddfree,
                4500000,mobile);


    }
}
