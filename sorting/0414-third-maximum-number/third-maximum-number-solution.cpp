class Solution {
public:
    int thirdMax(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int temp=0;
        int count=0,i=0;
        int n=nums.size();
        if(nums.size()<3)
            return nums.back();
        for(auto it=nums.rbegin();it!=nums.rend()-1;it++)
        {
            if(*it!=*(it+1))
            {
                count++;
            }
            if(count==2)
                return *(it+1);
        }
            return nums.back();
    } 
};
