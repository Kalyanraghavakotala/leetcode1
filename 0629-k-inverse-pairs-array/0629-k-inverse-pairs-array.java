class Solution {
    static int count=0;
    static int mod=1000000007;
    public int solve(int n,int k,int[][] dp){
        // if(n==0) return 0;
        if(k==0) return 1;
        if(dp[n][k]!=-1) return dp[n][k]; 
        count=0;
        
        for(int i=0;i<=Math.min(k,n-1);i++){
            count+=solve(n-1,k-i,dp);
            count%=mod;
        }
        dp[n][k]=count;
        return dp[n][k];
    }

    public int kInversePairs(int n, int k) {
    int dp[][]=new int[n+1][k+1];
    for(int[] i: dp){
        Arrays.fill(i, -1);
    }
    return solve(n,k,dp);
    }
}