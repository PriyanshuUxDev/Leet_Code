/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr=node;
        // while(curr!=null && curr.next!=null){
        //     curr.val=curr.next.val;
        //     curr.next=curr.next.next;
        // }
        // curr=null;
        // curr.val=null;
        
node.val = node.next.val;
    node.next = node.next.next;

        
    }
}