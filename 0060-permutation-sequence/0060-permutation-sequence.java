class Solution
{
    // static ArrayList<String> ar=new ArrayList<>();
    
    public String getPermutation(int n,int k)
    {
        StringBuilder s=new StringBuilder();
        int fact[]=new int[]{0,1,2,6,24,120,720,5040,40320,362880};
        int vis[]=new int[n+2];
        // // int fact=fac[n-1];
        // int n1=n;
       
        // while(n-- >0){
        //     int fact=fac[n1-1];
        //     int k1=k/fact;
        //     k-=fact;

        //     if(vis[k1+1]==0){
        //         s.append(k1+1);
        //         vis[k1+1]=1;
        //     } 
        //     else{
        //         for(int i=k1+1;i<n;i++){
        //             if(vis[i]==0){
        //                 s.append(i);
        //                 vis[i]=1;
        //                 break;
        //             }
        //         }
        //     }
            
        // }
        int x = n-1;
        for(int i = 0; i < n-1; i++){
            int ii = 1;
            while(true){
                if(vis[ii] == 0){
                    if(k - fact[x] <= 0){
                        s.append(ii);
                        vis[ii] = 1;
                        x--;
                        break;
                    }
                    else k -= fact[x];
                }
                ii++;
                
            }
        }
        for(int i = 1; i <= n; i++){
            if(vis[i] == 0){
                s.append(i);
                break;
            }
        }



        return s.toString();

    }
    
}