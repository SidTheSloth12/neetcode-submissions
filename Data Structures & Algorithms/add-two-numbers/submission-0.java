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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode();
        head.val=(l1.val+l2.val)%10;
        int carry=(l1.val+l2.val)/10;
        ListNode prev=head;
        l1=l1.next;l2=l2.next;
        while(l1!=null && l2!=null){
            ListNode current=new ListNode();
            current.val=(l1.val+l2.val+carry)%10;
            carry=(l1.val+l2.val+carry)/10;
            l1=l1.next;l2=l2.next;
            prev.next=current;
            prev=current;
        }
        while(l1!=null){
            ListNode current=new ListNode();
            current.val=(l1.val+carry)%10;
            carry=(l1.val+carry)/10;
            l1=l1.next;
            prev.next=current;
            prev=current;
        }
        while(l2!=null){
            ListNode current=new ListNode();
            current.val=(l2.val+carry)%10;
            carry=(l2.val+carry)/10;
            l2=l2.next;
            prev.next=current;
            prev=current;
        }
        if(carry!=0){
            ListNode current=new ListNode();
            current.val=carry;
            prev.next=current;
            current.next=null;
        }
        return head;
    }
}
