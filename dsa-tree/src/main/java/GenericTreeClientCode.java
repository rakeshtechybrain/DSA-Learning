import java.util.Stack;

public class GenericTreeClientCode {
    public static void main(String[] args) {








        GenericTreeNode root=extracted();
        //find the summ

        int sum=findSum(root);
        System.out.println(sum);













    }

    private static int findSum(GenericTreeNode root) {

        if(root==null) return 0;


        return (int)root.getData()+(int)findSum(root.getFirstChild())+(int)findSum(root.getSibling());

    }

    private static GenericTreeNode extracted() {
        GenericTreeNode root=new GenericTreeNode();
        root.setData(5);

        GenericTreeNode ch1=new GenericTreeNode(null,null,4);
        GenericTreeNode ch1sb1=new GenericTreeNode(null,null,3);
        GenericTreeNode ch1sb2=new GenericTreeNode(null,null,2);
        GenericTreeNode ch1sb3=new GenericTreeNode(null,null,1);
        GenericTreeNode ch2=new GenericTreeNode(null,null,9);

        root.setFirstChild(ch1);
        ch1.setSibling(ch1sb1);
        ch1sb1.setSibling(ch1sb2);
        ch1sb2.setSibling(ch1sb3);
        ch1sb1.setFirstChild(ch2);
        return root;
    }
}
