public class BinaryTreeClientClass {

    public static void main(String[] args) throws Exception {

        //Create Binary Tree
        BinaryTreeCloneImpl btc = new BinaryTreeCloneImpl();
        TreeNode root = new TreeNode();
        btc.constructBinaryTree(root);

       //BinaryTreeImpl.levelOrder(root);
       // BinaryTreeImpl.preOrderRec(root);
        //BinaryTreeImpl.inOrderRec(root);
        //BinaryTreeImpl.pOrderRec(root);
        //BinaryTreeImpl.spiralOrder(root);
       // BinaryTreeImpl.searchElement(root,3);
       // BinaryTreeImpl.countNodes(root);
        //BinaryTreeImpl.height(root);
        System.out.println(BinaryTreeImpl.height(root));
    }


}
