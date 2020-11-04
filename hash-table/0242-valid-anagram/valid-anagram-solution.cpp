class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size()!=t.size())
            return false;
        return solve(s,t);
    }
    bool solve(string s,string t)
    {
        int n=s.size();
        unordered_map<char,int>smap;
        unordered_map<char,int>tmap;
        for(int i=0;i<n;i++)
        {
            smap[s[i]]++;
            tmap[t[i]]++;
        }
        if(smap.size()!=tmap.size())
            return false;
        for(int i=0;i<smap.size();i++)
            if(smap[s[i]]!=tmap[s[i]])
                return false;
        return true;
    }
};
