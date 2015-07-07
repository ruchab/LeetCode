package Stack;

import java.util.Stack;

/**
 * Created by Rucha on 7/1/15.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> openDelimiter = new Stack<Character>();
        char nextChar;
        boolean isBalanced = true;

        int len = s.length();

        for(int i=0;i<len && isBalanced;i++){
            nextChar = s.charAt(i);
            switch (nextChar){
                case '(' :case '[' :case '{':
                    openDelimiter.push(nextChar);
                    break;
                case ')':case '}' :case ']':
                    if(openDelimiter.empty()){
                        isBalanced = false;
                    }else{
                        isBalanced = isPaired(openDelimiter.pop(),nextChar);
                    }
                    break;
                default:break;
            }


        }
        if(!openDelimiter.empty())
            isBalanced = false;

        return isBalanced;
    }

    public boolean isPaired(char open, char close){
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
