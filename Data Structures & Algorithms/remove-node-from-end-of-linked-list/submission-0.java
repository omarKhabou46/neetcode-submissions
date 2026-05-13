/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode h = head;
       int l = 0;
       while (h != null) {
        l++;
        h = h.next;
       }

       h = head;
       int s = l - n - 1;
       if (s == -1) {
        head = head.next;
        h.next = null;
       }else {
        while (s > 0) {
            h = h.next;
            s--;
        }

         ListNode p = h.next;
         h.next = p.next;
         p.next = null;
       }

       return head;

    }
}
