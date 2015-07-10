package Recursion;

/**
 * Created by Rucha on 7/8/15.
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println("rec" + factorial(5));
        System.out.println("ite" + factorialIterative(5));
    }

    public static int factorial(int n){
        if(n==0) return 1;
        return  n*factorial(n-1);
    }

    public static int factorialIterative(int n){
        int result =1;

        for(int i=n;i>0;i--){
            result = result * i;
        }
        return result;
    }
}
