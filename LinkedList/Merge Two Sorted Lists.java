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
        //Firstly we create a dummy node
        ListNode dummy = new ListNode(-1);
        ListNode ptr = dummy;
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        //While condition
        while(ptr1 != null && ptr2 != null){
            if(ptr1.val <= ptr2.val){
                ptr.next = ptr1; //attaching the less value node
                ptr1 = ptr1.next;
            }
            else{
                ptr.next = ptr2; //attaching the less value node
                ptr2 = ptr2.next;
            }
            ptr = ptr.next; // shifting the ptr value.
        }
        //if ptr1 is not null we attach at the end.
        if(ptr1 != null){
            ptr.next = ptr1;
            ptr = ptr.next;
        }
        //if ptr2 is not null we attach at the end.
        if(ptr2 != null){
            ptr.next = ptr2;
            ptr = ptr.next;
        }
        return dummy.next;
    }
}
