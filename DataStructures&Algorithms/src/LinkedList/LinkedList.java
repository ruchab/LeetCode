package LinkedList;

/**
 * Created by Rucha on 6/30/15.
 */
public class LinkedList {
    private Node head;
    private int numberOfEntries;

    public LinkedList(){
        head = null;
        numberOfEntries = 0;
    }

    public  LinkedList(Node head){
        this.head = head;
    }

    public boolean isEmpty(){
        return (numberOfEntries == 0);
    }

    public int getLength(){
        return this.numberOfEntries;
    }

    //Add an element in the linked list

    public void addNode(int position,int data){

        if(position >=1 && position <= numberOfEntries+1){
            Node newnode = new Node(data);

            if(position == 1){
                newnode.setNext(head);
                head = newnode;
            }else{
                Node nodeBefore = getNodeAt(position-1);
                Node nodeNext = nodeBefore.getNext();
                nodeBefore.setNext(newnode);
                newnode.setNext(nodeNext);
            }
            numberOfEntries++;
        }else{
            System.out.println("Position invalid");
        }
    }

    public Node getNodeAt(int position){

        assert (position>=1) && (position<=numberOfEntries) && (head!=null);

        Node currentNode = head;
        for(int i=1;i<position;i++){
            currentNode = currentNode.getNext();
        }
        assert (currentNode!=null);

        return currentNode;
    }

    //Remove Node

    public void remove(int position) {
        if (position >= 1 && position <= numberOfEntries) {
            if (position == 1) {
                head = head.getNext();
            } else {
                Node nodeBefore = getNodeAt(position - 1);
                Node nodeToRemove = nodeBefore.getNext();
                Node nodeNext = nodeToRemove.getNext();

                nodeBefore.setNext(nodeNext);
            }
            numberOfEntries--;
        } else {
            System.out.print("Invalid position");
        }
    }

    public void print(Node head){
        Node curr = head;
        for(int i =0;i<numberOfEntries;i++){
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }

    public Node reverse(Node head){
        Node temp = null;
        Node next = null;
        Node curr = head;
        while(curr!=null){
            next = curr.getNext();
            curr.setNext(temp);
            temp = curr;
            curr = next;
        }
        return temp;
    }

    public Node removeNthFromEnd(Node head, int n) {
        Node fast = head;
        Node slow = head;

        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        //if fast is already null means slow is at the nth position
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
        numberOfEntries--;
        return head;
    }
}
