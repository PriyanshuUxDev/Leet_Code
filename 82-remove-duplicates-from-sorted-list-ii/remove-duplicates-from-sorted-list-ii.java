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
        if (head == null || head.next == null) {
            return head;
        }
         ListNode dummy = new ListNode(-1);
         dummy.next=head;
        ListNode prev=dummy;
        ListNode left=head;
        ListNode right=head.next;
        while(right!=null ){
            if(left.val!=right.val) {
                right=right.next;
                left=left.next;
                prev=prev.next;
            }else{
            while(right != null && left.val == right.val){
                right=right.next;
               
            }
            prev.next=right;
            left=right;
           
                            if (right != null) {
                    right = right.next;
                }


            } 
        }
    
        return dummy.next;
    }
}