import java.util.List;

public class BinaryTreeClientClass {

    public static void main(String[] args) throws Exception {

        //Create Binary Tree
        BinaryTreeCloneImpl btc = new BinaryTreeCloneImpl();
        TreeNode root = new TreeNode();
       // btc.constructBinaryTree(root);
       //BinaryTreeImpl.levelOrder(root);
       // BinaryTreeImpl.preOrderRec(root); /O(n)
        //BinaryTreeImpl.inOrderRec(root);/O(n)
        //BinaryTreeImpl.pOrderRec(root);/O(n)
        //BinaryTreeImpl.spiralOrder(root);
       // BinaryTreeImpl.searchElement(root,3);
       // BinaryTreeImpl.countNodes(root);
        //BinaryTreeImpl.height(root);
        //System.out.println(BinaryTreeImpl.height(root));

        //List<Object> data= BinaryTreeImpl.preOrderIterative(root);
        //List<Object> data= BinaryTreeImpl.inOrderIterative(root);
        //List<Object> data= BinaryTreeImpl.postOrderIterative(root); //usingn 2Stack
       // List<Object> data= BinaryTreeImpl.postOrderIterativeusingOneStack(root); //using 1Stack
       // int maxElement=BinaryTreeImpl.findMaxElement(root);
        //int sizeOfBinaryTree=BinaryTreeImpl.calSizeOfbinaryTree(root);
        //System.out.print("sizeOfBinaryTree "+sizeOfBinaryTree);
        //TreeNode<Integer> node=BinaryTreeImpl.lca(root,new TreeNode<>(6),new TreeNode<>(54));

        //System.out.print("LCA  "+node.getData());

        /*List path=BinaryTreeImpl.pathRootToLeaf(root);

        int pathSum=81;

        for(Object x:path){
             int s=0;
            String [] sum=x.toString().split("->");

            for(String j:sum){
               s+= Integer.parseInt(j);
            }
            if(s==pathSum) {
                System.out.print(" " + x);
                System.out.println("  = " + s);
            }

        }*/

      // BinaryTreeImpl.postOrderIterative(root);
        //BinaryTreeImpl.inOrderIterative(root);
    //System.out.println(BinaryTreeImpl.diameter(root));
  //  BinaryTreeImpl.rightSideView(root);
   /* List<Object> listofNodesData= BinaryTreeImpl.topView(root);

    for (Object data:listofNodesData){
        System.out.println(data);
    }*/

      //  int ans=BinaryTreeImpl.burnBinaryTree(root,5);

       // System.out.println("data "+ans);

        //int ans1=BinaryTreeImpl.burnBinaryTreeusingHashMap(root,5);
      //  btc.constructBinarySearchTree(root);

       // System.out.println(BinaryTreeImpl.isBst(root));

        System.out.println(BinaryTreeImpl.isBst2(root)); //using inOrder Traverse



    }


}
