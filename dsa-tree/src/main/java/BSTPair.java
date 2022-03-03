public class BSTPair {

    public BSTPair() {
        this.isBst = isBst;
        this.min = min;
        this.max = max;
        this.root = root;
        this.size = size;
    }

    private boolean isBst;
    private int min;

    public boolean isBst() {
        return isBst;
    }

    public void setBst(boolean bst) {
        isBst = bst;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private int max;
    private TreeNode root;
    private int size;
}
