package Queue;

import java.util.Stack;

/**
 * Created by Rucha on 7/4/15.
 */
public class QueueWithTwoStacks {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void enqueue(int data){
        stack1.push(data);
    }

    public boolean isEmpty(){
        return (stack1.isEmpty()&&stack2.isEmpty());
    }

    public void movefromOnetotwo(){
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

    }
    public int dequeue(){
            if(stack2.isEmpty())
                movefromOnetotwo();
         return stack2.pop();
    }
}
