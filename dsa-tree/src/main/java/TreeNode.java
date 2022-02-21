public class TreeNode<T> {

    public TreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode() {
        this.rightChild = null;
        this.rightChild = null;
    }

    public TreeNode(T data) {
        this.rightChild = null;
        this.rightChild = null;
        this.data=data;
    }

    private TreeNode<T> rightChild;
    private TreeNode<T> leftChild;
    private T data;


}
