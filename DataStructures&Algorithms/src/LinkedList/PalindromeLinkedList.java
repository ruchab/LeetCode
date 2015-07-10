package LinkedList;

/**
 * Time Limit Exceeded
 * Created by Rucha on 7/9/15.
 * Given a singly linked list, determine if it is a palindrome.

 Follow up:
 Could you do it in O(n) time and O(1) space?
 */
 class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

//Reverse the list and compare if the two lists are equal or not
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        if(head == null) return true;
        ListNode node = head;
        ListNode reverseNode = reverse(head);

        while (node.next!=null && reverseNode.next!=null){
            if(node.val!=reverseNode.val){
                return false;
            }
            node = node.next;
            reverseNode = reverseNode.next;
        }

        return true;

    }

    public ListNode reverse(ListNode head){
        ListNode temp = null;
        ListNode next = null;
        ListNode current = head;

        while(current!=null){
            next = current.next;
            current.next = temp;
            temp = head;
            head = next;
        }

        return temp;
    }
}
