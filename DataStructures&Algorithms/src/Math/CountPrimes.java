package Math;

/**
 * Created by Rucha on 6/28/15.
 * A number which had multiple only 1 and itself.
 * 1 and 0 are neither prime nor composite
 */
public class CountPrimes {

    public int countPrimes(int n) {
        boolean [] isPrime = new boolean[n];
        int count=0;
        for(int i= 2;i<n;i++){
            if(isPrime[i]==false) {
                count++;
                for (int j = 2; j * i < n; j++) {
                    isPrime[i * j] = true;

                }

            }
        }

        return count;

    }


}

