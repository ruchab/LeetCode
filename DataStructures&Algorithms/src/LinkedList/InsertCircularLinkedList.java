package LinkedList;

/**
 * Asked in VMWare
 * Created by Rucha on 7/11/15.
 */
public class InsertCircularLinkedList {

    //n is not root;
    public void insertSorted(Node n , int data){

        if(n==null){
            n = new Node(data);
            n.next = n;
        }

        Node p = n;
        Node prev = null;

        do{
            prev = p;
            p = p.next;

            if(prev.data <= data && p.data >= data) break;
            //3-1 and insert 4 or insert 0 VVIMp
            if(prev.data >= p.data && (data >= prev.data || data<=p.data)) break;
        }while (p!=n);

        Node temp = new Node(data);
        prev.next = temp;
        temp.next =p;

    }
}
