class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums){
        int count = 0;
        int max_val = 0;
        for(int i= 0;i<nums.size();i++){
            // if(nums[i] == 1){
            //     count++;
            // }
            // if(nums[i]==0){
            //     if(max < count){
            //         max = count;
            //         count = 0;
            //     }
            // }
            if(nums[i] == 0){
                count = 0;
            }
            else{
                count++;
                max_val = max(max_val,count);
            }
        }
        return max_val;
}
};
