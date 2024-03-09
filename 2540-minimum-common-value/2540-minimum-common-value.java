class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        int j=0,i=0;
        while(true)
        {
            if(i>=nums1.length || j>=nums2.length) return -1;
            if(nums1[i]>nums2[j]) j++;
            else if(nums1[i]<nums2[j]) i++;
            else break;
        }
        return nums1[i];
    }
}