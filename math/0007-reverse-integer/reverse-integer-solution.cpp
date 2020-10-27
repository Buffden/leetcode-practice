class Solution {
public:
    int reverse(int x){
        while(x%10==0)
        {
            if((x<=9)&&(x>=-9))
                return x;
            else x/=10;
        }
        long long rev=0;
        int digit;
        do
        {
         digit = x % 10;
         rev = (rev * 10) + digit;
         x = x / 10;
        } while (x != 0);
        if((rev>INT_MAX)||(rev<INT_MIN))
            return 0;
        else return rev;
    }
};
