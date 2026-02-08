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
        ListNode ptr = head;
        int count = 0;

        // Count total nodes
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }

        // If head needs to be removed
        if (count == n) {
            return head.next;
        }

        // Reach node before deletion
        ListNode ptr1 = head;
        for (int i = 1; i < count - n; i++) {
            ptr1 = ptr1.next;
        }

        // Delete nth node from end
        ptr1.next = ptr1.next.next;

        return head;
    }
}
