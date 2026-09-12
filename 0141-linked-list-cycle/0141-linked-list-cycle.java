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
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        if(head==null ||head.next==null){
            return false;
        }
        while(temp !=null && temp.next!=null){
            head= head.next;
            temp = temp.next.next;
    
            if(temp==head){
                return true;
            }
        }
        return false;
    }
}