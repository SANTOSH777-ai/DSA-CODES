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
    public void reorderList(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        //To go to the middle of the linked list.
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        //Breaking the list into two.
        ListNode second = s.next;
        s.next = null;
        ListNode prev = null;
        //Reversing the second list.
        while(second != null){
            ListNode n = second.next;
            second.next = prev;
            prev = second;
            second = n;
        }
        second = prev;//head of the reversed list
        ListNode h = head;//head of the final answer
        //Connecting the two and reordering
        while(second != null){
            ListNode first = h.next;
            ListNode sec = second.next;
            h.next = second;
            second.next = first;
            h = first;
            second = sec;
        }
    }
}
