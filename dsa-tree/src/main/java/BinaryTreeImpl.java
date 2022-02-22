import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BinaryTreeImpl {


    public static void levelOrder(TreeNode root) throws Exception {
        if (root == null) throw new Exception("Tree must be exist");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.getData());
            if (node.getLeftChild() != null) {
                queue.add(node.getLeftChild());
            }
            if (node.getRightChild() != null) {
                queue.add(node.getRightChild());
            }
        }


    }

    public static void spiralOrder(TreeNode root) {


        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);

        while (!st1.isEmpty() || !st2.isEmpty()) {

            if (!st1.isEmpty()) {
                //pop from st1 ,print and push t st2, Left to right
                while (!st1.isEmpty()) {
                    TreeNode node = st1.pop();
                    System.out.println(node.getData());
                    if (node.getLeftChild() != null) st2.push(node.getLeftChild());
                    if (node.getRightChild() != null) st2.push(node.getRightChild());

                }

            }

            if (!st2.isEmpty()) {
                //pop from st1 ,print and push t st2, Left to right
                while (!st2.isEmpty()) {
                    TreeNode node = st2.pop();
                    System.out.println(node.getData());

                    if (node.getRightChild() != null) st1.push(node.getRightChild());
                    if (node.getLeftChild() != null) st1.push(node.getLeftChild());

                }

            }


        }


    }

    public static void pOrderRec(TreeNode root) {

        if (root != null) {
            preOrderRec(root.getLeftChild());
            preOrderRec(root.getRightChild());
            System.out.println(root.getData());
        }
    }

    public static void inOrderRec(TreeNode root) {

        if (root != null) {
            preOrderRec(root.getLeftChild());
            System.out.println(root.getData());
            preOrderRec(root.getRightChild());


        }
    }

    public static void preOrderRec(TreeNode root) {
        if (root != null) {
            System.out.println(root.getData());
            preOrderRec(root.getLeftChild());
            preOrderRec(root.getRightChild());


        }

    }

    public static boolean searchElement(TreeNode root, Integer c) {
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

    public static int countNodes(TreeNode root) {

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


    public static int height(TreeNode root) {

        if (root == null) return 0;

        int rh = height(root.getRightChild());
        int lh = height(root.getLeftChild());

        return Math.max(rh, lh) + 1;
    }
}
