public class BinaryTreeCloneImpl {


    public TreeNode constructBinaryTree(TreeNode root) {

        root.setData(1);
        root.setLeftChild(new TreeNode(2));
        root.setRightChild(new TreeNode(3));

        root.getLeftChild().setLeftChild(new TreeNode(4));
        root.getLeftChild().setRightChild(new TreeNode(5));

        root.getRightChild().setLeftChild(new TreeNode(6));
        root.getRightChild().setRightChild(new TreeNode(7));




        return root;

    }

    public TreeNode constructBinarySearchTree(TreeNode root) {

        root.setData(15);
        root.setLeftChild(new TreeNode(10));
        root.setRightChild(new TreeNode(25));

        root.getLeftChild().setLeftChild(new TreeNode(7));
        root.getLeftChild().setRightChild(new TreeNode(11));

        root.getRightChild().setLeftChild(new TreeNode(24));
        root.getRightChild().setRightChild(new TreeNode(26));




        return root;

    }

}
