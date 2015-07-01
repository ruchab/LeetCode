package LinkedList;

/**
 * Created by Rucha on 6/30/15.
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 */
public class getIntersectionNode {

    public Node getIntersectionNode(Node headA, Node headB) {

        if(headA==null || headB == null) return null;
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        int diff = Math.abs(lenA-lenB);
        if(lenA > lenB) {
            for (int i = 0; i < diff; i++) {
                headA = headA.next;
            }
        }else{
                for (int i = 0; i < diff; i++) {
                    headB = headB.next;
                }
            }

            while(headA!=null && headB!=null){
                if(headA==headB){
                    return headA;
                }
                headA = headA.next;
                headB = headB.next;
            }

            return null;
    }

    public int getLength(Node head){
        if(head== null) return 0;
        int count=0;
        Node current = head;
        while(current.next!=null){
            current = current.next;
            count++;
        }

        return count;
    }
}

