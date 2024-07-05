class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans={-1 , -1};
        ArrayList<Integer> a=new ArrayList<>();
        ListNode x=head;
        head=head.next;
        int c=2;
        ListNode fwd=head.next;
        while(head.next!=null){
            if(head.val>x.val && head.val>fwd.val){
                a.add(c);
            }
            else if(head.val<x.val && head.val<fwd.val){
                a.add(c);
            }
            c++;
            x=x.next;
            head=head.next;
            fwd=fwd.next;
        }
        Collections.sort(a);

        if(a.size()>1){
            int m=Integer.MAX_VALUE;
        for(int i=0;i<a.size()-1;i++){
            m=Math.min((a.get(i+1)-a.get(i)) , m);
        }
        ans[0]=m;
        ans[1]=a.get(a.size()-1)-a.get(0);}
        return ans;
    }
}