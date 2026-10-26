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
    public ListNode reverseList(ListNode head) {
         ListNode pre = null;
         ListNode curr = head;
         if(head==null){
            return null;
         }
         if(head.next == null){
            return head;
         }
         while(curr!=null){
          ListNode n = curr.next;
          curr.next = pre;
          pre = curr;
          curr = n;
         }
        //  head = p;
         return pre;
    }
}