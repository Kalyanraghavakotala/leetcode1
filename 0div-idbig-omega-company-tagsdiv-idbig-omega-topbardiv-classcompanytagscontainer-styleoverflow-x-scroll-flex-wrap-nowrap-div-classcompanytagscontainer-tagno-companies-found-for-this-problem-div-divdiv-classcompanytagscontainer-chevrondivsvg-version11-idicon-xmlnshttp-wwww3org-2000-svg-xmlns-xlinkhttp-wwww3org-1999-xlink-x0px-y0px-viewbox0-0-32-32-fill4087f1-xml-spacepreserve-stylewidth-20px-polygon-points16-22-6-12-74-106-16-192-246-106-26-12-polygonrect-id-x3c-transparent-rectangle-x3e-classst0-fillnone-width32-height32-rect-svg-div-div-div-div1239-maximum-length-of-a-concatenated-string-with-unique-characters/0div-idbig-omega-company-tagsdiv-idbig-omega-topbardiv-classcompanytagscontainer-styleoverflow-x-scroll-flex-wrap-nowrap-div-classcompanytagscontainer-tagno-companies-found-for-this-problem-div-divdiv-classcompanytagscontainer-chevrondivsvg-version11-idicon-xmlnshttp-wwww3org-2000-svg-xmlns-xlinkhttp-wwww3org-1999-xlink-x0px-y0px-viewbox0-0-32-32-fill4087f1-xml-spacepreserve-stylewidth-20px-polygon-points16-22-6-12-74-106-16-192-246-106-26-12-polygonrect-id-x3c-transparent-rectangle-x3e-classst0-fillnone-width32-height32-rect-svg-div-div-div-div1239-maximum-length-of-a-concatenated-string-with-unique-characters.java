class Solution {
    static int ans=0;
    static int check(String s){
        int dp[]=new int[26];
        for(int i=0;i<s.length();i++){
            if(dp[s.charAt(i)-'a']==1) return 0;
            else dp[s.charAt(i)-'a']=1;
        }
        return 1;
    }

    static void solve(int i,String r,List<String> ar){
        int checkin = check(r);
        
        // System.out.println(checkin);

        if(checkin==1){
            ans=Math.max(ans,r.length());
        }

        if(i==ar.size() || checkin==0)  return;

        for(int j=i;j<ar.size();j++){
            solve(j,r+ar.get(j),ar);
        }
        
    }

    public int maxLength(List<String> arr) {
        ans=0;
        solve(0,"",arr);
        // System.out.println(ans);
        return ans;
    }
}