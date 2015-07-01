package LinkedList;

/**
 * Created by Rucha on 6/30/15.
 * Two pointers
 * move fast
 * Given a linked list, remove the nth node from the end of list and return its head.
 */
public class removeNthFromEnd {

    public Node removeNthFromEnd(Node head, int n) {
        Node fast = head;
        Node slow = head;

        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }

        while(fast.next!=null){
            fast = fast.getNext();
            slow = slow.getNext();
        }
        //slow is the nth node from end
       slow.next = slow.next.next;
        return head;
    }
}
