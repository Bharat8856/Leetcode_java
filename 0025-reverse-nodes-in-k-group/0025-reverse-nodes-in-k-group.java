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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;

        while(true){
            ListNode kth=prev;

            for(int i=0;i<k;i++){
                kth=kth.next;
                if(kth==null){
                    return dummy.next;
                }
            }

            ListNode nextgroup=kth.next;
            ListNode prevNode   =nextgroup;
            ListNode curr=prev.next;
            while(curr!=nextgroup){
                ListNode next=curr.next;
                curr.next=prevNode;
                prevNode=curr;
                curr=next;
            }

            ListNode oldstart=prev.next;
            prev.next=kth;
            prev=oldstart;      
        }
    }
}