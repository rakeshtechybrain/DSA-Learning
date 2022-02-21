import java.util.Arrays;
import java.util.List;

public class BinaryTreeImpl {

    public static void main(String[] args) {
        //Create Binary TreeNode and Traverse the Child
        TreeNode root = new TreeNode();
        List<String> treeData = Arrays.asList("1", "2", "3", "4", "5", "6");
        for (String data : treeData) {
            root = insertInBinaryTree(root, data);
        }

        // /* Function to count number of nodes */
        int nodeCount=countNodes(root);
        /* Function to search for an element */
        boolean isFound= searchElement(root,"11");
        /* Function for inorder traversal */
        preOrderRec(root);
        pOrderRec(root);
        inOrderRec(root);

    }

    private static void pOrderRec(TreeNode root) {

        if(root!=null){
            preOrderRec(root.getLeftChild());
            preOrderRec(root.getRightChild());
            System.out.println(root.getData());
        }
    }

    private static void inOrderRec(TreeNode root) {

        if(root!=null){
            preOrderRec(root.getLeftChild());
            System.out.println(root.getData());
            preOrderRec(root.getRightChild());


        }
    }

    private static void preOrderRec(TreeNode root) {
        if(root!=null){
            System.out.println(root.getData());
            preOrderRec(root.getLeftChild());
            preOrderRec(root.getRightChild());


        }

    }

    private static boolean searchElement(TreeNode root, String c) {
        boolean isFound = false;

        if (root.getData() == c) return true;

        if (root.getLeftChild() != null) {
            isFound = searchElement(root.getLeftChild(), c);
        }
        if (root.getRightChild() != null) {
            isFound = searchElement(root.getRightChild(), c);
        }


        return isFound;
    }

    private static int countNodes(TreeNode root) {

        if (root == null) return 0;
        int count = 0;
        count += countNodes(root.getLeftChild());
        count += countNodes(root.getRightChild());

        return count + 1;
    }

    private static TreeNode insertInBinaryTree(TreeNode root, String data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {


            if (root.getLeftChild() == null) {
                root.setLeftChild(insertInBinaryTree(root.getLeftChild(), data));
            } else {
                root.setRightChild(insertInBinaryTree(root.getRightChild(), data));
            }
        }

        return root;
    }


}
