class Solution {
public:
    int mySqrt(int x) {
        if(x<=1)
            return x;
        double left=0.0, right=x;
        for(int i=0;i<=100;i++)
        {
            double mid=(left+right)/2.0;
            if(mid*mid<=x)
                left=mid;
            else right=mid;      
        }
        return left;
    }
};
