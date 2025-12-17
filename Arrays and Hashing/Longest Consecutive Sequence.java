Probmem Link: https://leetcode.com/problems/longest-consecutive-sequence/submissions/1858313582/

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int currentCount = 1;
        int longestCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                currentCount++;
            } else if (nums[i] != nums[i - 1]) {
                currentCount = 1;
            }
            longestCount = Math.max(longestCount, currentCount);
        }
        return longestCount;
    }
}
