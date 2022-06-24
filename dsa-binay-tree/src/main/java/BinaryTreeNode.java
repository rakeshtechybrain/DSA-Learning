public class BinaryTreeNode<Employee> {


    private Employee emp;

    public BinaryTreeNode() {

    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }

    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public BinaryTreeNode(Employee emp, BinaryTreeNode leftChild, BinaryTreeNode rightChild) {
        this.emp = emp;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }






}


