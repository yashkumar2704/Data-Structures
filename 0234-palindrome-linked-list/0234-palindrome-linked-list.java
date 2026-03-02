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
        ListNode slow=head;
        ListNode fast=head;
        if(head==null ||head.next==null)return true;
        if(head.next.next==null){
            if(head.next.val==head.val)return true;
            return false;
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode t=head;
        ListNode curr=slow;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        while(prev!=null){
            if(prev.val!=t.val){
                return false;
            }
            prev=prev.next;
            t=t.next;
        }
        return true;

    }
}