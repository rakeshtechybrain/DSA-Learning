/*
public class IntersactionList {

    public static void main(String[] args) {


        intesection();
    }

    private static void intesection() {

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            int lengthA=0;


            ListNode currentNodeA=headA;


            while(currentNodeA.next!=null){
                lengthA++;
                currentNodeA=currentNodeA.next;

            }
            int lengthB=0;
            ListNode currentNodeB=headB;
            while(currentNodeB.next!=null){
                lengthB++;
                currentNodeB=currentNodeB.next;

            }

            int diff=Math.abs(lengthA-lengthB);
            currentNodeA=headA;
            currentNodeB=headB;
            if(lengthA>lengthB){
                while(diff-->0){
                    currentNodeA=currentNodeA.next;

                }
            }
            else{
                while(diff-->0){
                    currentNodeB=currentNodeB.next;

                }
            }




            while(currentNodeA!=currentNodeB){
                currentNodeA=currentNodeA.next;
                currentNodeB=currentNodeB.next;
                if(currentNodeA==null ||currentNodeB==null)
                    return null;
            }


            return currentNodeB;
        }
    }
}
*/
