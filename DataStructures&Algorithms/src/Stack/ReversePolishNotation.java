package Stack;

import java.util.Stack;

/**
 * Created by Rucha on 7/3/15.
 */
public class ReversePolishNotation {
    public static void main(String[] args) {


    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int operandOne =0; int operandTwo = 0;
        int result =0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") ){
                operandTwo = stack.pop();
                operandOne = stack.pop();
                stack.push(operandOne + operandTwo);
            }else if(tokens[i].equals("-")){
                operandTwo = stack.pop();
                operandOne = stack.pop();
                stack.push(operandOne-operandTwo);
            }else if(tokens[i].equals("/")){
                operandTwo = stack.pop();
                operandOne = stack.pop();
                stack.push(operandOne/operandTwo);
            }else if(tokens[i].equals("*")){
                operandTwo = stack.pop();
                operandOne = stack.pop();
                stack.push(operandOne*operandTwo);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        result = stack.pop();
        return  result;
    }



}
