package Heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Rucha on 7/5/15.
 * Merge k sorted linked lists and return it as one sorted list.
 * Runtime: 360 ms
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class MergeKSortedLists {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if(lists.size()==0) return null;

        //Defining own comparator
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.size(),
                new Comparator<ListNode>() {
                    @Override
                    public int compare(ListNode a, ListNode b) {
                        if(a.val > b.val) return 1;
                        else if(a.val == b.val)
                        return 0;
                        else return -1;
                    }
                });

        //add first node of each list to pq

        for(ListNode list : lists){
            if(list!=null)
             pq.add(list);
        }

        ListNode head = new ListNode(0);
        ListNode p =head;

        while(pq.size()>0){
            ListNode temp = pq.poll();
            p.next = temp;
            if(temp.next!=null){
                pq.add(temp.next);
            }
            p = p.next;
        }

        return head.next;

    }
}
