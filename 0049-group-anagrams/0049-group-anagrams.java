class Solution {
    public static String sortString(String inputString)
    {
        
        char tempArray[] = inputString.toCharArray();
 
        Arrays.sort(tempArray);
 
        return new String(tempArray);
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            String w=sortString(strs[i]);
            if(hm.containsKey(w)) hm.get(w).add(strs[i]);
            else{
                List<String> l=new ArrayList<>();
                l.add(strs[i]);
                hm.put(w,l);
            }
        }
        // System.out.println(hm);
        
        List<List<String>> res=new ArrayList<>();
        
        for (Map.Entry<String, List<String>> it :hm.entrySet()) {
 
            res.add(it.getValue());
        }
        
        
        return res;
    }
}