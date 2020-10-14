vector<int> v(31,-1);
class Solution {
public:
    int fib(int N) {
        if(N<=1)
            return N;
        if(v[N]==-1)
            return v[N]=fib(N-1)+fib(N-2);
        return v[N];
    }
};
