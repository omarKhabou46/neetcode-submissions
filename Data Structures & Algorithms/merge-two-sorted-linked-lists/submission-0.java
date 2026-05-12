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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        else if (list2 == null) return list1;

        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode t = null;

        ListNode result = null;
        if (list1.val <= list2.val) result = list1;
        else result = list2;


        while (head1 != null) {
            if (head1.val > head2.val) {
                ListNode tmp = head1;
                head1 = head2;
                head2 = tmp;
            }

            while (head1 != null && head1.val <= head2.val) {
                t = head1;
                head1 = head1.next;
            }

            if (t != null) {
                t.next = head2;
                t = null;
            }
        
        } 
        return result;
    }
}