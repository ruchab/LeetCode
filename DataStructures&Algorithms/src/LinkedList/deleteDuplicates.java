package LinkedList;

/**
 * Created by Rucha on 6/30/15.
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * Two methods
 * 1.Use extra memory : 368ms
 * 2.No extra memory : 360ms
 */
public class deleteDuplicates {

    public Node deleteDuplicates(Node head) {
        if(head == null || head.next == null) return head;
//        HashSet<Integer> set = new HashSet<Integer>();
//        Node fake = new Node(0);
//        Node prev = fake;
//        prev.next = head;
//
//        while(prev.next!=null){
//            Node current = prev.next;
//            if(set.contains(current.data)){
//                prev.next = current.next;
//
//
//            }else{
//                set.add(current.data);
//                prev = current;
//            }
//            current = current.next;
//        }
//
//        return fake.next;

        Node prevNode = head;
        Node nextNode = prevNode.next;
        while(nextNode!=null){
            if(prevNode.data == nextNode.data){
                prevNode.next = nextNode.next;

            }else{
                prevNode = nextNode;
            }
            nextNode = nextNode.next;
        }

        return head;
    }
}

