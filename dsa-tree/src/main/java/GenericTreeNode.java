public class GenericTreeNode<T> {

    public GenericTreeNode(GenericTreeNode<T> firstChild, GenericTreeNode<T> sibling, T data) {
        this.firstChild = firstChild;
        this.sibling = sibling;
        this.data = data;
    }

    public GenericTreeNode() {

        this.firstChild=null;
        this.sibling=null;

    }

    public GenericTreeNode<T> getFirstChild() {
        return firstChild;
    }

    public void setFirstChild(GenericTreeNode<T> firstChild) {
        this.firstChild = firstChild;
    }

    public GenericTreeNode<T> getSibling() {
        return sibling;
    }

    public void setSibling(GenericTreeNode<T> sibling) {
        this.sibling = sibling;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private GenericTreeNode<T> firstChild;
    private GenericTreeNode<T> sibling;
    private T data;


}
