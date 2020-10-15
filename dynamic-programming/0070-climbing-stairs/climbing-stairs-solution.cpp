vector<int> v(46,-1);
class Solution {
public:
    int climbStairs(int n) {
        if(n<=2)
            return n;
        if(v[n]!=-1)
            return v[n];
        return v[n]=climbStairs(n-1)+climbStairs(n-2);
        
    }
};
