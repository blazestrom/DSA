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
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        ListNode d1 = new ListNode(0);
        ListNode d2= new ListNode(0);
        ListNode bef= d1;
        ListNode aff=d2;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                bef.next=temp;
                bef=bef.next;
            }
            else{
                aff.next=temp;
                aff=aff.next;
            }
            temp=temp.next;
        }
        bef.next=d2.next;
        aff.next=null;
        head=d1.next;
        return head;
    }
    
}