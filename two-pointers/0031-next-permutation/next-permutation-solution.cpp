/*class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        if(nums.size()<=1)
            return;
        int n=nums.size();
        int i=n-1;
        if(nums[i]>nums[i-1])
        {
            int temp=nums[i];
            nums[i]=nums[i-1];
            nums[i-1]=temp;
            return;
        }
        if(nums.size()==2)
        {
            if(nums[0]==nums[1])
                return;
        }
        i=n-1;
        while(i-1>=0&&(nums[i-1]>=nums[i+1]))
            i--;
        if(i==0)
        {
            sort(nums.begin(),nums.end());
            return;
        }
        if(i!=0)
        {
            sort(nums.begin()+i,nums.end());
            int k=i-1;
            while((nums[k]>nums[i++])&&(i<=n-1));
            int t=nums[k];
            nums[k]=nums[i];
            nums[i]=t;
            return;
        }
            
        
        
    }
};
*/
class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int i = nums.size()-1;
        while (--i>=0 && nums[i] >= nums[i+1]);
        sort(nums.begin()+i+1, nums.end());
        if (i==-1)
            return;
        auto itr = upper_bound(nums.begin()+i+1, nums.end(), nums[i]);
        int temp = nums[i];
        nums[i] = *itr;
        *itr = temp;
    }
};
