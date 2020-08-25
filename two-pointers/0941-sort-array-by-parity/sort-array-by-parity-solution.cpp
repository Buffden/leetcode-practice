class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& A) {
        int n=A.size();
    for(int i=0;i<n;i++)
        if(A[i]%2==0)
           A.push_back(A[i]);
    for(int i=0;i<n;i++)
        if(A[i]%2!=0)
            A.push_back(A[i]);
    while(n--)
        A.erase(A.begin());
    return A;
    }
};
