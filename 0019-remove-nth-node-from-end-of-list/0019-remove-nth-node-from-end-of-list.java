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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d = new ListNode (0);
        d.next = head;
        ListNode curr = d;
        ListNode nex = d;
        for(int i = 0; i<n; i++){
            nex = nex.next;
        }
        while(nex.next!=null){
            curr= curr.next;
            nex = nex.next;
        }
        curr.next = curr.next.next;
        return d.next;
    }
}