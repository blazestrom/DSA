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
    public int getDecimalValue(ListNode head) {
        if(head==null)return 0;
        ListNode temp= head;
        int cur =0;
        while(temp!=null){
            cur=cur*2+temp.val;
            temp=temp.next;
        }
        return cur;       
    }
}