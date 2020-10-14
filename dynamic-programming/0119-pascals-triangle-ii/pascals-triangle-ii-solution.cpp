class Solution {
public:
    vector<int> getRow(int rowIndex) {
        if(rowIndex==0)
            return {1};
        auto prevRow=getRow(rowIndex-1);
        vector<int> curRow(rowIndex+1,1);
        
        for(int i=1;i<rowIndex;i++)
            curRow[i]=prevRow[i-1]+prevRow[i];
        return curRow;
    }
};
