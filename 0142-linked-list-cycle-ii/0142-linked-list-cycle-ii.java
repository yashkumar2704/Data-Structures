/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        while(fast!=null && fast.next!=null ){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)break;
        }
        if( fast==null ||fast.next==null)return null;
        while(temp!=fast ){
            fast=fast.next;
            temp=temp.next;
            if(fast==temp)return fast;
        }
        return temp;
    }
}