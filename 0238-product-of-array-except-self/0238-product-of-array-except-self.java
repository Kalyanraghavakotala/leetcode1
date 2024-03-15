class Solution {
    public int[] productExceptSelf(int[] n) {
        int len=n.length;
        int f=1;
        int pref[]=new int[len];
        int suff[]=new int[len];
        int res[]=new int[len];
        pref[0]=n[0];
        //suff[len-1]=1;
        for(int i=1;i<len;i++){
            pref[i]=pref[i-1]*n[i];
            //suff[len-i-1]*=n[len-i-1];
        }
        for(int i=len-1;i>=0;i--){
            f*=n[i];
            suff[i]=f;
        }
        
        res[0]=suff[1];
        res[len-1]=pref[len-2];

        for(int i=1;i<len-1;i++){
            res[i]=pref[i-1]*suff[i+1];
        }
        return res;
    }
}