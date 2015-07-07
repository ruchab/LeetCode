package Stack;

import java.util.Stack;

/**
 * Created by Rucha on 7/3/15.
 * Given an absolute path for a file (Unix-style), simplify it.
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 */
public class SimplifyPath {

    public static void main(String[] args) {
        System.out.print(simplifyPath("/abc/..."));
    }

    public static String simplifyPath(String path) {
        Stack<String> resultPath = new Stack<String>();

        for(String s : path.split("/")){
            if(s.equals("..") && !resultPath.empty()){
                resultPath.pop();
            }else if(!s.equals(".") && !s.equals("") && !s.equals("..")){
                resultPath.push(s);
            }
        }



        String res = "";
        while(!resultPath.empty()){
            String dir = resultPath.pop();
            System.out.println("dir" + dir);
            res = "/" + dir + res;
            System.out.println("result::" +  res);
        }
        return res.isEmpty() ? "/" : res;

    }
}
