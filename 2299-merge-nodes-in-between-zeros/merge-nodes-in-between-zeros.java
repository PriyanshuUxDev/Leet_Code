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
    public ListNode mergeNodes(ListNode head) {
        ListNode write=head;
        ListNode curr=head.next;
                int sum=0;
        while(curr!=null){
            
            if (curr.val == 0) {
                write.val = sum;
                sum = 0;
                if(curr.next!=null){

                write = write.next;
                }
            } 
                sum += curr.val;
                curr=curr.next;
         
        }
          write.next=null;
        return head;  
    }
}