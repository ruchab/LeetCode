package Queue;

import java.util.Stack;

/**
 * Created by Rucha on 7/4/15.
 */
public class QueueUsingOneStack {

    Stack<Integer> stack1 = new Stack<Integer>();


    public void enqueue(int data){
        stack1.push(data);
    }

    public int dequeue(){
        int top = stack1.pop();
        if(stack1.isEmpty()){
            return top;
        }else{
            int result = dequeue();
            stack1.push(top);
            return result;
        }
    }

}
