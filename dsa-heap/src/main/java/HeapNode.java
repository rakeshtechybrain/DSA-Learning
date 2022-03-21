public class HeapNode {

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public HeapNode getlChild() {
        return lChild;
    }

    public void setlChild(HeapNode lChild) {
        this.lChild = lChild;
    }

    public HeapNode getrChild() {
        return rChild;
    }

    public void setrChild(HeapNode rChild) {
        this.rChild = rChild;
    }

    private int data;
    private HeapNode lChild;
    private HeapNode rChild;
}
