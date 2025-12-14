Problem Link: https://leetcode.com/problems/contains-duplicate/


import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        if (nums.length == 1)
            return false;
        for (int i = 0; i < nums.length; i++) {
            if (ans.contains(nums[i])) {
                return true;
            } else
                ans.add(nums[i]);
        }
        return false;
    }
}
