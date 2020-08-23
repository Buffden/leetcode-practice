class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int max=-10000;
        for(int i=0;i<arr.size()-1;i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {
                if(max<arr[j])
                    max=arr[j];
            }
            arr.erase(arr.begin()+i);
            arr.emplace(arr.begin()+i,max);
            max=-10000;
        }
        arr.pop_back();
        arr.push_back(-1);   
        return arr;
    }
};
