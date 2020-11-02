class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int n=matrix.size();
        int k=n;
        while(k--)
        {
            vector<int> temp(n,0);
            matrix.push_back(temp);
        }
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                matrix[j+n][n-1-i]=matrix[i][j];
        matrix.erase(matrix.begin(),matrix.begin()+n);
    }
};
