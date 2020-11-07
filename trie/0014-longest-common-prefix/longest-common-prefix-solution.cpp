class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if(strs.size() < 1)
            return "";
        int min =INT_MAX;
        int count=0;
        string min_string;  
        for(int i=0;i<strs.size();i++) //exrating the min string from the vector
        {
            int len=strs[i].size();
            if(len<min)
            {
                min =len;
                min_string =strs[i];
            }
        }
        for(int i=0;i<min;i++)
        {
            for(int j=0;j<strs.size();j++)
            {
                if(strs[j][i]!=min_string[i])
                    return min_string.substr(0,count);
            }
            count++;
        }
        return min_string.substr(0,count);  
        }
        
    };
