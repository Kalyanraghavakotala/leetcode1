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

// class Solution {
//     public ListNode partition(ListNode head, int x) {


//         ListNode list1 = new ListNode(0);
//         ListNode tail1 = list1;
//         ListNode list2 = new ListNode(0);
//         ListNode tail2 = list2;
//         while(head != null ){
//             if(head.val < x){
//                 tail1.next = head;
//                 tail1 = tail1.next;
//             }
//             else{
//                 tail2.next = head;
//                 tail2 = tail2.next;

//             }
//             head = head.next;
//         }
//         tail1.next = list2.next;
//         tail2.next = null;

//         return list1.next;
        
//     }
// }




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
        // System.gc();
        return res.next;
    }
}