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
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        HashMap<ListNode, Integer> map=new HashMap<>();
        map.put(head,head.val);head=head.next;
        while(head!=null){
            if(map.containsKey(head)){
                return true;
            }
            map.put(head,head.val);head=head.next;
        }
        return false;
    }
}
