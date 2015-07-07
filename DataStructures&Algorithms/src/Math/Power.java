package Math;

/**
 * Created by Rucha on 7/5/15.
 * Implement pow(x, n).
 */
public class Power {

    //1.Naive Method : n is positive O(n)
    //Time limit exceeded Last executed input:
   // 0.00001, 2147483647

  /*  public double pow(double x, int n) {
        if(x == 0) return 0;
        if(n == 0) return 1;
        double result =1;
        for(int i=1;i<=n;i++){
            result = result * x;
        }
        return result;
    }*/

    //Runtime: 280 ms Accepted

    public double myPow(double x, int n) {
        if(n < 0) return (1/power(x,-n));
        else return power(x,n);
    }

    public double power(double x,int n){
        if(n == 0) return 1;
        double half = power(x,n/2);
        if(n%2==0){
            return half*half;
        }else{
            return half*half*x;
        }
    }

}
