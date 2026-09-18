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
    public ListNode rotateRight(ListNode head, int k) {

        ListNode dummy = new ListNode(-1);
        if(head==null || k==0) return head;
        dummy.next = head;
        ListNode curr = head;
        int n = 1;
        while (curr.next != null) {
            n++;
            curr = curr.next;
        }
        k = k % n;
        if (k == 0 || n == 1)
            return dummy.next;

        ListNode left = dummy.next;
        for (int i = 0; i < n - k-1; i++) {
            left = left.next;
        }
        ListNode right = left.next;

        curr.next = dummy.next;
        left.next = null;

        return right;
    }
}