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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        ListNode D= new ListNode (0);
        D.next=head;
        ListNode cur=head;
        ListNode pre=D;
        while(cur!=null && cur.next!=null){
              ListNode sec= cur.next;
              cur.next= sec.next;
              sec.next=pre.next;
              pre.next=sec;
              pre=cur;
              cur=cur.next;
        }
        return D.next;
        
    }
}