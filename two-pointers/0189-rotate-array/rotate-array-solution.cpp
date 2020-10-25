class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        if((nums.size()==1)||(nums.size()==k)||k==0)
            return;
        if(nums.size()==2)
        {
            if(k%2==0)
                return;
            else
            {
                int temp=nums[0];
                nums[0]=nums[1];
                nums[1]=temp;
                return;
            }
        }
        if(k%nums.size()==0)
            return;
        vector<int> n;
        k=k%nums.size();
        for(int i=nums.size()-k;i<nums.size();i++)
            n.push_back(nums[i]);
        for(int i=0;i<nums.size()-k;i++)
            n.push_back(nums[i]);
        vector<int> temp;
        temp=n;
        n=nums;
        nums=temp;
    }
};

/* ------- runtime error------------

void rotate(vector<int>& nums, int k) {
        vector<int> n;
        for(int i=nums.size()-k;i<nums.size();i++)
            n.push_back(nums[i]);
        for(int i=0;i<nums.size()-k;i++)
            n.push_back(nums[i]);
        vector<int> temp;
        temp=n;
        n=nums;
        nums=temp;
    }
*/
