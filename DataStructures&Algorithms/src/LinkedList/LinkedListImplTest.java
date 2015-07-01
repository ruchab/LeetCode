package LinkedList;

/**
 * Created by Rucha on 6/30/15.
 */
public class LinkedListImplTest {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addNode(1,1);
        ll.addNode(2,2);
        ll.addNode(3,3);
        ll.addNode(4,4);
        ll.addNode(5,5);



        Node temp = ll.removeNthFromEnd(ll.getNodeAt(1),2);
        ll.print(temp);

//        Node rev = ll.reverse(ll.getNodeAt(1));
//        ll.print(rev);



//        ll.remove(2);
//        ll.print();
    }
}
