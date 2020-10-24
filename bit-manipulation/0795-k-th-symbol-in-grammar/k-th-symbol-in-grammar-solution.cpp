class Solution {
public:
    int kthGrammar(int N, int K){
        return solve(N,K);
    }    
    int solve(int N,int K)
    {
        int n=pow(2,N-1);
        if(N==1)
            return 0;
        if(K<=n/2)
            return solve(N-1,K);
        else
            return !solve(N-1,K-n/2);
    } 
};
