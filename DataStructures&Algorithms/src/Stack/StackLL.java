package Stack;

/**
 * Created by Rucha on 7/1/15.
 * Implement stack using linked list
 */
public class StackLL {

    private Node topNode;

    public StackLL(){
        topNode = null;
    }

    public void push(int data){
        if(topNode == null){
            topNode.data = data;
        }else{
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = topNode;
            topNode = newNode;

        }
    }

    public int pop(){
        if(topNode == null) return -1;
        else{
            int data = topNode.data;
            topNode = topNode.next;
            return  data;
        }
    }

    public int peek(){
        if(topNode!=null) {
            return topNode.data;
        }else
            return -1;
    }


}
