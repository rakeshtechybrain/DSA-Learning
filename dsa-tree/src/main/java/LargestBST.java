public class LargestBST {


    public static void main(String[] args) {

        int min=Integer.MAX_VALUE;

    }

    public int largestBST(TreeNode root){

        int m=0;
        NodeState temp=solve(root,m);

        return  m;

    }

    public NodeState solve(TreeNode root,int ans){

        if(root==null) return new NodeState(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);

        NodeState left=solve(root.getLeftChild(),ans);
        NodeState right=solve(root.getRightChild(),ans);

        NodeState currentNode=null;
        currentNode.setSize(left.getSize()+right.getSize()+1);
        currentNode.setMin(Math.min((int)root.getData(),left.getMin()));
        currentNode.setMa(Math.max((int)root.getData(),right.getMa()));

        if(left.isBST && right.isBST&&((int)root.getData()>left.getMa() && (int)root.getData()<right.getMin())){
            currentNode.setBST(true);
        }
        else
            currentNode.setBST(false);


        if(currentNode.isBST){

            ans=Math.max(ans,currentNode.getSize());
        }

        return currentNode;

    }



}

 class NodeState{

     public NodeState(int min, int ma, int size, boolean isBST) {
         this.min = min;
         this.ma = ma;
         this.size = size;
         this.isBST = isBST;
     }

     public int getMin() {
         return min;
     }

     public void setMin(int min) {
         this.min = min;
     }

     public int getMa() {
         return ma;
     }

     public void setMa(int ma) {
         this.ma = ma;
     }

     public int getSize() {
         return size;
     }

     public void setSize(int size) {
         this.size = size;
     }

     public boolean isBST() {
         return isBST;
     }

     public void setBST(boolean BST) {
         isBST = BST;
     }

     int min;
     int ma;

     int size;
    boolean isBST;


}
