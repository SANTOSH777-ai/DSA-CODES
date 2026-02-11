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
    public ListNode reverseList(ListNode head) {
      //previous Node
      ListNode prev = null;
      //Present Node
      ListNode ptr = head;
      while(ptr != null){
        ListNode n = ptr.next; //saving the next node in advance
        ptr.next = prev;
        prev = ptr;
        ptr = n;
      }
      return prev;
    }
}
