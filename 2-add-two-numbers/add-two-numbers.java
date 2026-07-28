class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int c = 0;
        while (l1 != null || l2 != null || c > 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + c;
            ListNode node = new ListNode(sum % 10);
            c = sum / 10;
            curr.next = node;
            curr = curr.next;

            if (l1 != null) {
                l1 = l1.next;
            } 

            if (l2 != null) {
                l2 = l2.next;
            } 

        }
        return dummy.next;
    }
}