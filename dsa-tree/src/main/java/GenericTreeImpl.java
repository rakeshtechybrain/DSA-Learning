import java.util.Stack;

public class GenericTreeImpl {
    public static void main(String[] args) {

        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1};

        Stack<Node> st = new Stack<>();
        Node root = new Node();

        for (int data : arr) {

            if (data == -1) {
                st.pop();
            } else {

                Node node = new Node();
                node.setData(data);
                if (st.size() > 0) {

                    if (st.peek().getFirstChild() != null) {
                        setSibling(st.peek().getFirstChild(), node);
                    } else {

                        st.peek().setFirstChild(node);
                    }
                    st.push(node);
                } else {
                    root = node;
                    st.push(node);
                }

            }


        }
System.out.println(root);

    }

    private static void setSibling(Node parrentFirstChild, Node nodeTobeSetAsSibling) {

        while (parrentFirstChild.getSiblings() != null) {
            parrentFirstChild = parrentFirstChild.getSiblings();
        }
        parrentFirstChild.setSiblings(nodeTobeSetAsSibling);

    }


}

class Node {
    int data;
    Node firstChild;
    Node siblings;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getFirstChild() {
        return firstChild;
    }

    public void setFirstChild(Node firstChild) {
        this.firstChild = firstChild;
    }

    public Node getSiblings() {
        return siblings;
    }

    public void setSiblings(Node siblings) {
        this.siblings = siblings;
    }


}
