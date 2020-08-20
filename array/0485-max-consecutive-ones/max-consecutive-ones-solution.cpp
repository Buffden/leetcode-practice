class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int count=0, maxvalue=0;
        while(!nums.empty())
        {
            if(nums.back()==1)
            {
                count++;
                if(maxvalue<count)
                    maxvalue=count;
                nums.pop_back();
            }
            else
            {
                nums.pop_back();
                count=0;
            }
            
        }
        return maxvalue;
        
    }
};
