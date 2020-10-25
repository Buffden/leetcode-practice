class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_set<int> u;
        for(auto& i:nums)
            u.insert(i);
        if(u.size()==nums.size())
            return false;
        return true;
            
        
    }
};
