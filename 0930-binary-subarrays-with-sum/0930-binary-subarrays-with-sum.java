class Solution {
    public int numSubarraysWithSum(int[] arr, int k) {
        int p=0,c=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            p+=arr[i];
            
            if(p==k){
                c++;
            }
            if(hm.containsKey(p-k)){
                c+=hm.get(p-k);
                
            }
            if(hm.containsKey(p)){
                    hm.put(p,hm.get(p)+1);
            }
            else{
                hm.put(p,1);
            }
            
        }
        return c;
        
    }
}