package arrays;

import java.util.ArrayList;

/**
 * Created by Rucha on 7/11/15.
 * Write a code that, given a stream of data compress it as the value and
 * its frequencies that occurs consecutively, for ex (1,1,1,1,2,2,3,3,3,2) return (1,4) (2,2) (3,3) (2,1)
 */

class entry{
    public int value;
    public int frequency;
}

public class compressNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 3, 3, 3, 2};
        compressNumbers(arr);
    }

    public static void compressNumbers(int[] arr) {
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < arr.length; i++) {

            int a = arr[i];
            int count = 1;

            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }

            if (arr[i] != a) {
                continue;
            } else {
                list.add("(" + a + "," + count + ")");
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}

