class Solution 
{
    public int solve(String s1,String s2,int i1,int i2,int m,int n,int [][]dp){
        if(i1 >= m  || i2 >= n) return 0;
        
        if(dp[i1][i2]!=-1) return dp[i1][i2];
        
        if(s1.charAt(i1) == s2.charAt(i2)){
            return dp[i1][i2]= 1+solve(s1,s2,i1+1,i2+1,m,n,dp);
        }
        return dp[i1][i2] = Math.max(solve(s1,s2,i1+1,i2,m,n,dp),solve(s1,s2,i1,i2+1,m,n,dp));
    }
    
    public int longestCommonSubsequence(String text1, String text2) 
    {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m][n];
        for(int[] i:dp) Arrays.fill(i,-1);
        return solve(text1,text2,0,0,m,n,dp);
    }
}