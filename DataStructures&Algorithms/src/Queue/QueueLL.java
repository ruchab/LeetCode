package Queue;

/**
 * Created by Rucha on 7/4/15.
 */
public class QueueLL {

    public Node frontNode;
    public Node lastNode;

    public QueueLL(){
        frontNode = null;
        lastNode = null;
    }

    public boolean isEmpty(){
        return (frontNode == null && lastNode == null);
    }
    //Add an element into a queue
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(isEmpty()) {
            frontNode = newNode;
        }
        else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }

    public int dequeue(){
        int data;
        if(isEmpty()){
            return 0;
        }else{
            data = frontNode.data;
            frontNode = frontNode.next;
        }
        return data;
    }

    public int getFront(){
        if(isEmpty())
            return 0;
        else
            return frontNode.data;
    }
}
