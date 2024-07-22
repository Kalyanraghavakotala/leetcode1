class Solution {
    public String[] sortPeople(String[] names, int[] h) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<h.length;i++){
            hm.put(h[i],i);
        }
        Arrays.sort(h);
        String res[]=new String[h.length];
        int ind=0;
        for(int i=h.length-1;i>=0;i--){
            res[ind++]=names[hm.get(h[i])];
        }
        return res;
    }
}