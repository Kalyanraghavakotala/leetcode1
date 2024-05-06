class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode t=head;
        ArrayList<Integer> ar=new ArrayList<>();
        ArrayList<Integer> ar1=new ArrayList<>();
        while(t!=null){
            ar.add(t.val);
            t=t.next;
        }
        Collections.reverse(ar);
        int m=ar.get(0);
        ListNode res=new ListNode(0);
        t=res;
        ar1.add(ar.get(0));
        for(int i=1;i<ar.size();i++){
            if(ar.get(i)>=m){
                ar1.add(ar.get(i));
                m=ar.get(i);
            }
        }
        Collections.reverse(ar1);
        System.out.println(ar1);
        for(int i=0;i<ar1.size();i++){
            t.next=new ListNode(ar1.get(i));
            t=t.next;
        }
        return res.next;

    }
}