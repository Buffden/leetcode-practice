class Solution {
public:
    int search(vector<int>& nums, int target) {
        int n=nums.size();
        if(n==1)
        {
            if(target==nums[0])
                return 0;
            return -1;
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
                return i;
        }
        return -1;
    }
};
