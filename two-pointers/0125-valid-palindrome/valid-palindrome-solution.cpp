class Solution {
public:
    bool isPalindrome(string s) {
        if(s.size()<=1)
            return true;
        for(int i=0;i<s.size();i++)
        {
            if(s[i]>=48&&s[i]<=57)
                continue;
            if((s[i]>=65&&s[i]<=90)||(s[i]<=122&&s[i]>=97))
                continue;
            else s.erase(i--,1);
        }
        int mid=0;
        if(s.size()%2==0)
            mid=s.size()/2;
        else 
            mid=(s.size()-1)/2;
        int c=s.size();
        for(int i=0;i<c;i++)
            if(s[i]>=65&&s[i]<=90)
                s[i]=char(s[i]+32);
        for(int i=0;i<mid;i++)
        {
            if(s[i]!=s[c-i-1])
                return false;
        }
        return true;
    }
};
