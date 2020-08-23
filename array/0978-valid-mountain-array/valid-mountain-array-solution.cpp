class Solution {
public:
    bool validMountainArray(vector<int>& A) {
        int i=0,j=0;
        if(A.size()<=2)
            return false;
        for(i=0;i<A.size();i++)
        {
            if(A[i]<A[i+1])
                continue;
            else if((i==0)||(i==A.size()-1))
                return false;
            else
                break;
        }
        for(j=A.size()-1;j>i;j--)
        {
            if(A[j]<A[j-1])
                continue;
            else if(j==A.size()-1)
                return false;
            else 
                break;
        }
        return (A[i]==A[j])?true:false;
        
    }
};
