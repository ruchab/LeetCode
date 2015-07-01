package LinkedList;

/**
 * Created by Rucha on 6/30/15.
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class mergeTwoLists {

    public Node mergeTwoLists(Node l1, Node l2) {
       //new list dummy node
       Node fake = new Node(0);
       Node l3 = fake;

       while(l1!=null && l2!=null){
           if(l1.data > l2.data){
               l3.next = l2;
               l2 = l2.next;
           }else{
               l3.next = l1;
               l1 = l1.next;
           }
           l3 = l3.next;
       }
        //copy the entire l1 to l3
        if(l1!=null){
            l3.next = l1;
        }

        if(l2!=null){
            l3.next = l2;
        }

     return fake.next;

    }
}


