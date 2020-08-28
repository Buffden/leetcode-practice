class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        int n=nums.size();
        vector<int >v(n,-1);
        for(int i=0;i<n;i++)
            v[nums[i]-1]=0;
        for(int i=0;i<n;i++)
            if(v[i]!=0)
                v.push_back(i+1);
        v.erase(v.begin(),v.begin()+n);
        return v; 
    }  
};
