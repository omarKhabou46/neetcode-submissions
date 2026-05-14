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
    // public boolean hasCycle(ListNode head) {
    //     Set<ListNode> set = new HashSet<>();
    //     ListNode h = head;
    //     while (h != null && !set.contains(h)) {
    //         set.add(h);
    //         h = h.next;
    //     }

    //     if (h == null) return false;
    //     else return true;
    // }

     public boolean hasCycle(ListNode head) {
      ListNode fast = head;
      ListNode slow = head;
      while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

    
        return false;

      }
    
    }

