import java.util.*;

public class BinaryTreeImpl {

    static List res;
    static TreeNode pre = null;

    public static void levelOrder(TreeNode root) throws Exception {
        if (root == null) throw new Exception("Tree must be exist");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.getData());
            if (node.getLeftChild() != null) {
                queue.add(node.getLeftChild());
            }
            if (node.getRightChild() != null) {
                queue.add(node.getRightChild());
            }
        }


    }

    public static void spiralOrder(TreeNode root) {


        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);

        while (!st1.isEmpty() || !st2.isEmpty()) {

            if (!st1.isEmpty()) {
                //pop from st1 ,print and push t st2, Left to right
                while (!st1.isEmpty()) {
                    TreeNode node = st1.pop();
                    System.out.println(node.getData());
                    if (node.getLeftChild() != null) st2.push(node.getLeftChild());
                    if (node.getRightChild() != null) st2.push(node.getRightChild());

                }

            }

            if (!st2.isEmpty()) {
                //pop from st1 ,print and push t st2, Left to right
                while (!st2.isEmpty()) {
                    TreeNode node = st2.pop();
                    System.out.println(node.getData());

                    if (node.getRightChild() != null) st1.push(node.getRightChild());
                    if (node.getLeftChild() != null) st1.push(node.getLeftChild());

                }

            }


        }


    }

    public static void pOrderRec(TreeNode root) {

        if (root != null) {
            preOrderRec(root.getLeftChild());
            preOrderRec(root.getRightChild());
            System.out.println(root.getData());
        }
    }

    public static void inOrderRec(TreeNode root) {

        if (root != null) {
            preOrderRec(root.getLeftChild());
            System.out.println(root.getData());
            preOrderRec(root.getRightChild());


        }
    }

    public static void preOrderRec(TreeNode root) {
        if (root != null) {
            System.out.println(root.getData());
            preOrderRec(root.getLeftChild());
            preOrderRec(root.getRightChild());


        }

    }

    public static boolean searchElement(TreeNode root, Integer c) {
        boolean isFound = false;

        if (root.getData() == c) return true;

        if (root.getLeftChild() != null) {
            isFound = searchElement(root.getLeftChild(), c);
        }
        if (root.getRightChild() != null) {
            isFound = searchElement(root.getRightChild(), c);
        }


        return isFound;
    }

    public static int countNodes(TreeNode root) {

        if (root == null) return 0;
        int count = 0;
        count += countNodes(root.getLeftChild());
        count += countNodes(root.getRightChild());

        return count + 1;
    }

    private static TreeNode insertInBinaryTree(TreeNode root, String data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {


            if (root.getLeftChild() == null) {
                root.setLeftChild(insertInBinaryTree(root.getLeftChild(), data));
            } else {
                root.setRightChild(insertInBinaryTree(root.getRightChild(), data));
            }
        }

        return root;
    }

    public static int height(TreeNode root) {

        if (root == null) return 0;

        int rh = height(root.getRightChild());
        int lh = height(root.getLeftChild());

        return Math.max(rh, lh) + 1;
    }

    public static List<Object> preOrderIterative(TreeNode root) throws Exception {
        if (root == null) throw new Exception("root must be exist");
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        List<Object> orderdNodeList = new ArrayList<>();

        while (!st.isEmpty()) {
            TreeNode node = st.pop();

            orderdNodeList.add(node.getData());
            if (node.getRightChild() != null) st.push(node.getRightChild());
            if (node.getLeftChild() != null) st.push(node.getLeftChild());

        }
        return orderdNodeList;
    }

    public static List<Object> inOrderIterative(TreeNode root) throws Exception {

        if (root == null) throw new Exception("root must be exist");
        List<Object> orderdNodeList = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        while (true) {

            if (root != null) {
                st.push(root);
                root = root.getLeftChild();
            } else {
                if (st.isEmpty()) break;
                root = st.pop();
                orderdNodeList.add(root.getData());
                root = root.getRightChild();
            }

        }


        return orderdNodeList;

    }

    public static List<Object> postOrderIterative(TreeNode root) {
        Stack<TreeNode> st1 = new Stack();
        Stack<TreeNode> st2 = new Stack();
        List<Object> orderdNodeList = new ArrayList<>();
        st1.push(root);
        TreeNode curr = null;

        while (!st1.isEmpty()) {
            curr = st1.pop();
            st2.push(curr);
            if (curr.getLeftChild() != null) st1.push(curr.getLeftChild());
            if (curr.getRightChild() != null) st1.push(curr.getRightChild());

        }
        while (!st2.isEmpty()) {
            curr = st2.pop();
            // System.out.println(curr);
            orderdNodeList.add(curr.getData());
        }


        return orderdNodeList;

    }

    public static List<Object> postOrderIterativeusingOneStack(TreeNode root) {
        List<Object> orderdNodeList = new ArrayList<>();

        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        TreeNode pre = null;

        while (curr != null || !st.isEmpty()) {
            if (curr != null) {
                st.push(curr);
                curr = curr.getLeftChild();
            } else {
                curr = st.peek();

                if (curr.getRightChild() == null || curr.getRightChild() == pre) {
                    orderdNodeList.add(curr.getData());
                    st.pop();
                    pre = curr;
                    curr = null;

                } else {
                    curr = curr.getRightChild();
                }

            }


        }


        return orderdNodeList;
    }

    public static int findMaxElement(TreeNode root) {

        int max = Integer.MIN_VALUE;

        if (root != null) {
            int value = (int) root.getData();
            int lMax = findMaxElement(root.getLeftChild());
            int rMax = findMaxElement(root.getRightChild());
            max = Math.max(lMax, rMax);
            max = Math.max(max, value);

        }

        return max;

    }

    public static int calSizeOfbinaryTree(TreeNode root) {
        if (root == null) return 0;

        return calSizeOfbinaryTree(root.getLeftChild()) + calSizeOfbinaryTree(root.getRightChild()) + 1;
    }

    public static TreeNode<Integer> lca(TreeNode root, TreeNode<Integer> a,
                                        TreeNode<Integer> b) {

        if (root == null) {
            return null;
        }
        if (root == a || root == b) {
            return root;
        }
        TreeNode left = lca(root.getLeftChild(), a, b);
        TreeNode right = lca(root.getRightChild(), a, b);

        if (left == null && right == null) {
            return null;
        }
        if (left != null && right != null) {
            return root;
        }
        if (left == null) {
            return right;
        } else {
            return left;
        }

    }

    public static List pathRootToLeaf(TreeNode root) {

        res = new ArrayList<>();
        printPathForomRootToLeaf(root, "");


        return res;
    }

    private static void printPathForomRootToLeaf(TreeNode root, String path) {
        if (root == null)
            return;
        path = path + root.getData();
        if (root.getLeftChild() == null && root.getRightChild() == null) {
            res.add(path);

        } else {
            path = path + "->";
            printPathForomRootToLeaf(root.getLeftChild(), path);
            printPathForomRootToLeaf(root.getRightChild(), path);
        }
    }

    public static int diameter(TreeNode root) {
        //base condition
        if (root == null) return 0;

        int ld = diameter(root.getLeftChild());

        int rd = diameter(root.getRightChild());

        int lh = height(root.getLeftChild());

        int rh = height(root.getRightChild());

        return Math.max(Math.max(ld, rd), lh + rh + 1);

    }

    public static void rightSideView(TreeNode root) throws Exception {

        if (root == null) {
            throw new Exception("root not be null");
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Object> element = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                //print the first element of list
                System.out.println(element.get(element.size() - 1));
                element = new ArrayList<>();
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                element.add(node.getData());
                if (node.getLeftChild() != null) queue.add(node.getLeftChild());
                if (node.getRightChild() != null) queue.add(node.getRightChild());
            }
        }

    }

    public static List<Object> topView(TreeNode root) {

        Queue<Pair> queue = new ArrayDeque<>();
        Map<Integer, Object> map = new TreeMap<>();
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair node = queue.poll();
            //if condition for top view only
            if (!map.containsKey(node.getHd())) {
                map.put(node.getHd(), node.getNode().getData());
            }
            //otherwiae put all va;ue for bottom up
            //map.put(node.getHd(),node.getNode().getData());
            if (node.getNode().getLeftChild() != null) {
                queue.add(new Pair(node.getNode().getLeftChild(), node.getHd() - 1));
            }
            if (node.getNode().getRightChild() != null) {
                queue.add(new Pair(node.getNode().getRightChild(), node.getHd() + 1));
            }

        }

        List<Object> ans = new ArrayList(map.size());

        for (Map.Entry<Integer, Object> data : map.entrySet()) {
            ans.add(data.getValue());

        }

        return ans;


    }

    public static int burnBinaryTree(TreeNode root, int target) {

        Depth depth = new Depth(-1);
        return burnTree(root, target, depth);


    }

    private static int burnTree(TreeNode root, int target, Depth depth) {
        int ans = -1;

        if (root == null) return 0;
        if (root.getData().equals(target)) {
            depth.setD(1);
            return 1;
        }
        Depth ld = new Depth(-1);

        Depth rd = new Depth(-1);

        int lh = burnTree(root.getLeftChild(), target, depth);

        int rh = burnTree(root.getRightChild(), target, depth);

        if (ld.getD() != -1) {
            ans = Math.max(ans, ld.getD() + 1 + rh);
            ld.setD(ld.getD() + 1);
        }
        if (rd.getD() != -1) {
            ans = Math.max(ans, rd.getD() + 1 + lh);
            rd.setD(rd.getD() + 1);
        }

        return Math.max(lh, rh) + 1;

    }

    public static int burnBinaryTreeusingHashMap(TreeNode root, int target) {
        int ans = 0;
        if (root == null) return 0;
        if (root.getData().equals(target)) return 1;

        //fill up the hashmap of node and their parents
        Map<TreeNode, TreeNode> parentChildRelMap = new HashMap<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        ArrayList<Object> nodes = new ArrayList<>();
        queue.add(root);
        parentChildRelMap.put(root, null);

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();
            nodes.add(node);

            if (node.getLeftChild() != null) {

                parentChildRelMap.put(node.getLeftChild(), node);
                queue.add(node.getLeftChild());
            }
            if (node.getRightChild() != null) {
                parentChildRelMap.put(node.getRightChild(), node);
                queue.add(node.getRightChild());

            }

        }

        TreeNode parent = null;
        for (Map.Entry<TreeNode, TreeNode> e : parentChildRelMap.entrySet()) {

            if (e.getKey().getData().equals(target)) {
                //start burn from here
                ans++;
                nodes.remove(e.getKey().getData());
                parent = e.getValue();
                break;


            }

        }

        while (nodes.size() > 0) {
            ans++;

            TreeNode rchield = parent.getRightChild();
            TreeNode lChield = parent.getLeftChild();
            parent = parentChildRelMap.getOrDefault(parent, null);


            ans++;
            nodes.remove(parent.getData());
            nodes.remove(rchield.getData());
            nodes.remove(lChield.getData());


        }

        return ans;
    }

    public static boolean isBst(TreeNode root) {

        return checkForBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    private static boolean checkForBst(TreeNode root, int min, int max) {

        if (root == null) return true;

        if ((int) root.getData() < min || (int) root.getData() > max) {
            return false;

        }
        return (checkForBst(root.getLeftChild(), min, (int) root.getData() - 1) &&
                checkForBst(root.getRightChild(), (int) root.getData() + 1, max));
    }

    public static boolean isBst2(TreeNode root) {

        if (root != null) {

            if (!isBst(root.getLeftChild()))
                return false;

            if (pre != null && (int) pre.getData() >= (int) root.getData())
                return false;
            pre = root;
            return isBst(root.getRightChild());
        } else return true;

    }

    public static BSTPair largestBst(TreeNode root) {

        if (root == null) {

            BSTPair bp = new BSTPair();
            bp.setBst(true);
            bp.setMin(Integer.MAX_VALUE);
            bp.setMax(Integer.MIN_VALUE);
            bp.setSize(0);
            return bp;
        }

        BSTPair lp = largestBst(root.getLeftChild());
        BSTPair rp = largestBst(root.getRightChild());

        BSTPair bp = new BSTPair();
        bp.setBst(lp.isBst()
                && rp.isBst()
                && (int) root.getData() >= lp.getMax()
                && (int) root.getData() <= rp.getMin());
        ;

        bp.setMin(Math.min((int) root.getData(), Math.min(lp.getMin(), rp.getMin())));
        bp.setMax(Math.max((int) root.getData(), Math.max(lp.getMax(), rp.getMax())));

        if (bp.isBst()) {
            bp.setRoot(root);
            bp.setSize(lp.getSize() + rp.getSize() + 1);

        } else if (lp.getSize() > rp.getSize()) {
            bp.setRoot(lp.getRoot());
            bp.setSize(lp.getSize());
        } else {
            bp.setRoot(rp.getRoot());
            bp.setSize(rp.getSize());
        }

        return bp;

    }

    static TreeNode prev;
    static TreeNode head;
    public static TreeNode convertBinartyToDLL(TreeNode root) {

        //Base Case
        if(root==null) return null;
        //As Follow InOrder Traverse
        //Go to Left
        convertBinartyToDLL(root.getLeftChild());

        if(prev==null)
            head=root;
        else{
            root.setLeftChild(prev);
            prev.setRightChild(root);
        }
        prev=root;



        convertBinartyToDLL(root.getRightChild());




    return head;
    }
}


