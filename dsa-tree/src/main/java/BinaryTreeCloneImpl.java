public class BinaryTreeCloneImpl {


    public TreeNode constructBinaryTree(TreeNode root){

        root.setData(1);
        root.setLeftChild(new TreeNode(2));
        root.setRightChild(new TreeNode(3));

        root.getLeftChild().setLeftChild(new TreeNode(11));
        root.getLeftChild().setRightChild(new TreeNode(5));


        root.getRightChild().setLeftChild(new TreeNode(6));
        root.getRightChild().setRightChild(new TreeNode(18));

        root.getLeftChild().getLeftChild().setLeftChild(new TreeNode(21));
        root.getLeftChild().getLeftChild().setRightChild(new TreeNode(51));

        root.getRightChild().getRightChild().setRightChild(new TreeNode(54));





        return root;

    }

}
