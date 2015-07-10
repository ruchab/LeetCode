package Recursion;

/**
 * Created by Rucha on 7/8/15.
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Rec" + fib(5));
        System.out.println("Ite" + fibIterative(5));
    }

    public static int fib(int n){

        if(n==0) return 0;
        if(n==1) return 1;

        else
            return fib(n-1) + fib(n-2);
    }

    public static int fibIterative(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        int a=0;
        int b=1;
        int c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
