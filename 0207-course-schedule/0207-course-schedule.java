class Solution {

    public boolean canFinish(int n, int[][] p) {
        int deg[]=new int[n];
        Queue<Integer> q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)    adj.add(new ArrayList<>());
        ArrayList<Integer> ar=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<p.length;i++)
        {
            adj.get(p[i][0]).add(p[i][1]);
            
        }

        for(int i=0;i<adj.size();i++){
            for(int j:adj.get(i)){
                deg[j]++;
            }
        }

        for(int i=0;i<n;i++){
            if(deg[i]==0)   q.add(i);
        }
        while(q.size()!=0) {
        	int i=q.poll();
        	System.out.print(i+" ");
            ar.add(i);
        	for(int ele:adj.get(i)) {
        		deg[ele]-=1;
        		if(deg[ele]==0) q.add(ele);
        	}
        }

        System.out.println(q);
        if(ar.size()!=n)    return false;
        return true;

        


        }
}