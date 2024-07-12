class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();
        HashSet<Character> hs=new HashSet<>();
        HashSet<Character> hs1=new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
            hs1.add(t.charAt(i));
        }
        
        if(hs.size()!=hs1.size()) return false;
        
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(t.charAt(i))){
                hm.put(t.charAt(i),s.charAt(i));
            }
            else{
                if(hm.get(t.charAt(i))!=s.charAt(i)){
                    return false;
                }
            }
        }
        System.out.print(hm);
        return true;
    }
}