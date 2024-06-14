class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);

        int n = 0; 
        int max = 0; 
        for (int num : nums) 
        {
            
            n = Math.max(n, num);
            max += n - num;
            n += 1; 
        }
        
        return max;
    }
}


