package LinkedList;

/**
 * Created by Rucha on 7/1/15.
 */
public class rotateRight {

    public Node rotateRight(Node head, int k) {

        if(head == null || head.next == null || k < 1)
            return head;
        Node runner = head;
        int len = 1;
        while(runner.next!=null){
            runner = runner.next;
            len++;
        }
        k = k%len;
        runner.next = head;

        runner = head;
        for(int i=0;i<len-k-1;i++){
            runner = runner.next;
        }

        head = runner.next;
        runner.next = null;

        return head;

    }
}
