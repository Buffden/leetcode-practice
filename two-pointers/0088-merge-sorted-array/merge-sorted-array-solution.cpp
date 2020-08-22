class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        nums1.erase(nums1.begin()+m,nums1.end());
        for(auto e:  nums2)
            nums1.push_back(e);
        sort(nums1.begin(),nums1.end());
    }
};
