class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int c=nums[0];
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
            hm.put(nums[i],1);    
            }
            else{
                hm.put(nums[i],hm.get(nums[i])+1);
                if(hm.get(c)<hm.get(nums[i])){
                c=nums[i];   
                }
            }
        }
        // System.out.println(hm);
        return c;
    }
}