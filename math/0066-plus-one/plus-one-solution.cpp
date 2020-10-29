class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int size=digits.size();
        vector<int> res(size);
        int carry=1;
        for(int i=size-1;i>=0;i--)
        {
            int temp=digits[i]+carry;
            res[i]=temp%10;
            carry=(temp>9)?1:0;
        }
        if(carry)
            res.insert(res.begin(),carry);
        return res;
        
    }
};
