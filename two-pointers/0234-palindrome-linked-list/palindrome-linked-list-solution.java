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
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = reverseListNode(slow);
        slow = head;

        while (slow != null && fast != null) {
            if (slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public static ListNode reverseListNode (ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        // traverse all the nodes of LinkedList
        while (curr != null) {

            // store next
            next = curr.next;

            // reverse current nodes next pointer
            curr.next = prev;

            // move pointers one position ahead
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
