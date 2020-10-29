class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int prev_max=nums[0];
        int global_max=nums[0];
        for(int i=1;i<nums.size();i++)
        {
            prev_max=max(nums[i],nums[i]+prev_max);
            global_max=max(prev_max,global_max);
        }
        return global_max;
    }
};
