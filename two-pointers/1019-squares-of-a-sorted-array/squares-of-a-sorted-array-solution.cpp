class Solution {
public:
    vector<int> sortedSquares(vector<int>& A) {
        for(auto &e:A)
            e=e*e;
        sort(A.begin(),A.end());
        return A;
    }
};
