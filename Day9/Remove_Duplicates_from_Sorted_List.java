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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-101);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr.next!=null){
            if(curr.val == curr.next.val){
                ListNode temp = curr.next;
                curr.next = curr.next.next;
                temp.next = null;
            }else{
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}