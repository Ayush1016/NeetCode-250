Problem Link: https://leetcode.com/problems/two-sum/

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int>ans;
        for(int i=0;i<nums.size();i++){
            int value=target-nums[i];
            if(ans.find(value)!=ans.end()){
                return {ans[value],i};
            }
            ans[nums[i]]=i;
        }
        return{-1,-1};
    }
};
