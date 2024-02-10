class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int c=0;
        int max=1,st=0;
        boolean t[][]=new boolean[n][n];
        for(int i=0;i<n;i++){
            t[i][i]=true;
            c++;
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                t[i][i+1]=true;
                c++;
            }
        }

        for(int k=3;k<=n;k++){
            for(int i=0;i<n-k+1;i++){
                int j=i+k-1;
                if(t[i+1][j-1] && s.charAt(i)==s.charAt(j)){
                    t[i][j]=true;
                    c++;
                }
            }
        }
        return c;
        
        
    }
}