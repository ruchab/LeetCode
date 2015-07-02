package LinkedList;

/**
 * Created by Rucha on 7/1/15.
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 *reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 *You must do this in-place without altering the nodes' values.
 */
public class reorderList {

    public void reorderList(Node head) {
        Node current = head;
        int length = getLength(head);
        for(int i =0;i<length/2;i++){
            current = current.next;
        }

        Node newList = current.next; // start of the second list
        current.next = null; //end first half of the list

        //reverse second list
        Node revNewList = reverse(newList);

        Node m1 = head;
        Node m2 = revNewList;
        //merge new reversed list and the first list

        while (m2!=null){
           Node temp1 = m1.next;
           Node temp2 = m2.next;
            m1.next = m2;
            m2.next = temp1;

            m1 = temp1;
            m2 = temp2;
        }



    }

    public static int getLength(Node head){
        Node current = head;
        int count=0;
        while(current.next!=null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static Node reverse(Node head){
        Node temp = null;
        Node next = null;
        Node current = head;
        while(current.next!=null){
            next = current.next;
            current.next = temp;
            temp = head;
            head = next;
        }
        return temp;
    }
}
