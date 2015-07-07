package Queue;

/**
 * Created by Rucha on 7/4/15.
 */
public class QueueWithTwoStacksTest {
    public static void main(String[] args) {
       QueueUsingOneStack q = new QueueUsingOneStack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);


        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
