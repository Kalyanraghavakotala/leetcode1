class Solution {
    
    boolean dp[],ans1[];
    
    boolean solve(int i,int[] nums,int n){
        if(i >= n-1) return true;
        if(ans1[i]) return dp[i];
        boolean ans = false;
        for(int j=nums[i];j>0;j--){
            ans = ans || solve(i+j,nums,n);
        }
        ans1[i]=true;
        return dp[i]=ans;
    }
    
    public boolean canJump(int[] nums) {
        
        int n=nums.length;
        dp=new boolean[n];
        ans1=new boolean[n];
        return solve(0,nums,n);
    }
}