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

	static int len(ListNode head) {
		int c = 0;
		ListNode mover = head;
		while(mover!=null) {
			c++;
			mover = mover.next;
		}
		return c;
	}
	static ListNode reverse(ListNode head,int l) {
		ListNode mover = head;
		ListNode prev = null;
		for(int i=1;i<l;i++) {
			mover = mover.next;
		}
		ListNode curr  = mover;
		while(curr!=null) {
			ListNode front = curr.next;
			curr.next = prev;
			prev = curr;
			curr = front;
		}
		
		return prev;
	}
    public void reorderList(ListNode head) {
        ListNode t1 = head; 
        int l  = len(head);
        ListNode t2 = reverse(head,l/2+1);
        while(t2!=null && t2.next!=null) {
			ListNode front1 = t1.next;
			t1.next = t2;
			ListNode front2 = t2.next;
			t2.next = front1; 
			t1 = front1;
			t2 = front2;
		}   
        return; 
    }
}