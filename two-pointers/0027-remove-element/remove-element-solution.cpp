class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        while(1)
        {
            auto it=find(nums.begin(),nums.end(),val);
            if(it!=nums.end())
                nums.erase(it);
            else return nums.size();
        }
    }
};
