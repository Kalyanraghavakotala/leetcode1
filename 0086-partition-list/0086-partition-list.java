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
        ListNode res=new ListNode(0);
        ListNode res1=new ListNode(0);
        ListNode temp=res;
        ListNode temp2=res1;
        ListNode temp1=head;
        while(temp1!=null){
            if(temp1.val < x){
                temp.next=new ListNode(temp1.val);
                temp=temp.next;
            }
            if(temp1.val >= x){
                temp2.next=new ListNode(temp1.val);
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        temp.next=res1.next; 
        
        return res.next;
    }
}