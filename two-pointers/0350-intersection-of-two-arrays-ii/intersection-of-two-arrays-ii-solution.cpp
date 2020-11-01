class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        return (nums1.size()>nums2.size())?solve(nums1,nums2):solve(nums2,nums1);
        
    }
    vector<int > solve(vector<int> a, vector<int> b){
        sort(a.begin(),a.end());
        sort(b.begin(),b.end());
        vector<int> ans;
        /*for(auto i:nums1)
            cout<<i<<" ";
        cout<<endl;
        for(auto i: nums2)
            cout<<i<<" ";
        cout<<endl;
        return nums1;*/
        int i1=0,i2=0;
        while(i1 < a.size() && i2 < b.size()) {
            if(a[i1] == b[i2]) {
                ans.push_back(a[i1]);
                i1++;
                i2++;
            } else if(a[i1] < b[i2]) {
                i1++;
            } else {
                i2++;
            }
        }
        
        return ans;
    }
};
