package Stack;

/**
 * Created by Rucha on 7/1/15.
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */

public class MinStack {

    class Node {

        public int item;
        public Node next;
        public int min;

        public Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node head;
    private int size = 0;

    public void push(int x) {
        if (size == 0) {
            head = new Node(x, null);
            head.min = x;
        } else {
            int min = head.min > x? x: head.min;
            Node newNode = new Node(x, head);
            head = newNode;
            head.min = min;
        }
        size++;
    }

    public void pop() {
        if (size == 0) {
            return;
        }
        head = head.next;
        size--;
    }

    public int top() {
        return head.item;
    }

    public int getMin() {
        return head.min;
    }
}
