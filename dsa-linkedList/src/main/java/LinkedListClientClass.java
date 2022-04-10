public class LinkedListClientClass {

    public static void main(String[] args) {
        //create Linked List;

        String[] heads = {"1", "2", "3", "4", "5"};

        LinkedListNode head = structSinglyLinkedList(heads);

        int k=2;

     //   head=rotateLinkedList(head,k);

        head=swapPairWise(head);



    }

    private static LinkedListNode swapPairWise(LinkedListNode heads) {
        LinkedListNode p;
        LinkedListNode start_node;
        p=heads;
        start_node=heads.getNext();

        while(true){
            LinkedListNode q=p.getNext();
            LinkedListNode temp=q.getNext();
            q.setNext(p);

    if(temp==null){
        p.setNext(null);
        break;
    }
    else if(temp.getNext()==null){
        p.getNext().setNext(null);
        break;
    }

            p.setNext(q.getNext());
            p=temp;


        }





        return start_node;

    }

    private static LinkedListNode rotateLinkedList(LinkedListNode head, int k) {


        if (head == null || head.getNext() == null || k == 0){
            return head;
        }

        LinkedListNode currentNode=head;
        int length=1;
        while(currentNode.getNext()!=null){
            currentNode=currentNode.getNext();
            length++;
        }
        currentNode.setNext(head);

        int count=length-(k%length);

        while (count>0){
            currentNode=currentNode.getNext();
            count--;
        }

        head=currentNode.getNext();
        currentNode.setNext(null);

        return  head;

    }

    private static LinkedListNode structSinglyLinkedList(String[] heads) {
        LinkedListNode head = null;


        for (String node : heads) {

            if (head == null) {

                head = new LinkedListNode<>();
                head.setData(node);

            } else {
                LinkedListNode current = head;

                while (current.getNext() != null) {

                    current = current.getNext();


                }
                LinkedListNode n = new LinkedListNode();
                n.setData(node);
                current.setNext(n);

            }


        }

        return head;

    }
}
