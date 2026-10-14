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
        ListNode smalldummy=new ListNode(0);
        ListNode largedummy= new ListNode(0);

        ListNode list1=smalldummy;
        ListNode list2=largedummy;
        ListNode curr=head;

        while(curr!=null){
            if(curr.val<x){
               list1.next=curr;
               list1=list1.next;
            }
            else{
                list2.next=curr;
                list2=list2.next;
            }
            curr=curr.next;
        }

        list2.next=null;
        list1.next=largedummy.next;

        return smalldummy.next;
    }
}