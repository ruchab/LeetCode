package LinkedList;

/**
 * Created by Rucha on 6/30/15.
 * Remove all elements from a linked list of integers that have value val.
 */
public class removeElements {

    public Node removeElements(Node head, int val) {
        Node fake = new Node(0);
        Node prev = fake;
        prev.next = head;
        while(prev.next!=null){
            Node current = prev.next;
            if(current.data == val){
                prev.next = current.next;
            }else{
                prev = current;
            }

            current = current.next;
        }
        return fake.next;
    }
}
