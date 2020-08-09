class Solution {
public:
    bool isPowerOfFour(int num) {
        if((num<0)||(num==0))
            return false;
        double temp1=log(num)/log(4);
        long long int temp2=log(num)/log(4);
        if(temp1==temp2)
            return true;
        else 
            return false;
        
    }   
};
