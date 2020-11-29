class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.size()==0)
            return false;
        int n=matrix.size();
        int m=matrix[0].size();
        for(int i=0;i<n;i++)
        {
            if(matrix[i].size()==0)
                continue;
            if(matrix[i][0]>target)
                return false;
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==target)
                    return true;
                else if(matrix[i][j]>target)
                    return false;
            }
        }
        return false;
    }
};
