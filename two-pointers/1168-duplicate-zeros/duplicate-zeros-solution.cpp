#include<bits/stdc++.h>
class Solution {
public:
    void duplicateZeros(vector<int>& arr) {
        int n=arr.size();
        int i=0;
        while(i!=arr.size()-1)
        {
            if(arr[i]==0)
            {
                arr.emplace (arr.begin()+i,0);
                i+=2;
            }
            else
                i++;
        }
        arr.resize(n);
        
    }
};
