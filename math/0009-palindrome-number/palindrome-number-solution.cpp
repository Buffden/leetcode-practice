class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0)
            return false;
        int y=x;
        long int num=0;
        while(y!=0)
        {
            num=num*10 + y%10;
            y/=10;
        }
        if((num>INT_MAX)||(num<INT_MIN))
            return false;
        if(num==x)
            return true;
        else return false;
        
        
    }
};
