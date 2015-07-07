package Heap;

import java.util.PriorityQueue;

/**
 * Created by Rucha on 7/5/15.
 */
public class PriorityQueueTest {

    public static void main(String[] args) {
        int[] a = {1, 10, 5, 3, 4, 7, 6, 9, 8};
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i : a){
            pq.offer(i);
        }

        System.out.println("PQ::" + pq);
    }
}
