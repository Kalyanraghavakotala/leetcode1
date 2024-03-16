class Solution {
  public int findMaxLength(int[] nums) {
    int ans = 0;
    int prefix = 0;
    Map<Integer, Integer> mp = new HashMap<>();
    mp.put(0, -1);

    for (int i = 0; i < nums.length; ++i) {
      prefix += nums[i] == 1 ? 1 : -1;
      if (mp.containsKey(prefix))
        ans = Math.max(ans, i - mp.get(prefix));
      else
        mp.put(prefix, i);
    }

    return ans;
  }
}