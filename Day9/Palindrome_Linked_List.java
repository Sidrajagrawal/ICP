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
    public boolean isPalindrome(ListNode head) {
        return IsPallindrom(head);       
    }

    static boolean IsPallindrom (ListNode head){
        if(head == null || head.next == null) return true;

        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverse(slow);
        
        ListNode firsthalf = head;
        ListNode temp = secondHalf;

        while(temp!=null){
            if(firsthalf.val != temp.val){
                return false;
            }
            temp = temp.next;
            firsthalf = firsthalf.next;
        }

        return true;
    }

    static ListNode reverse(ListNode rev){
        ListNode current = rev;
        ListNode prev = null;
        while(current!=null){
            ListNode front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }
        return prev;
    }
}