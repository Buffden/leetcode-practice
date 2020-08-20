class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int ans=0;
        for(int &e: nums)
        {
            int count=0;
            while(e!=0)
            {
                e/=10;
                count++;
            }
            if(count%2==0)
                ans++;
        }
            return ans;

    }
};
