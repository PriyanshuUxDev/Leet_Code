
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode curr = head;
        ListNode prev = dummy;
        if (curr == null)
            return null;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            }else{
            prev = curr;

            }
            curr = curr.next;
        }
        return dummy.next;

    }
}