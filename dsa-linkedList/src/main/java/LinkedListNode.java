public class LinkedListNode<T> {

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public LinkedListNode() {

        this.next = null;
    }

    private T data;
    private LinkedListNode next;

}
