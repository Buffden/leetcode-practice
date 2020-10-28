class Solution {
public:
    int romanToInt(string s) {
        int ans=0,p=0;
        for(int i=s.size()-1;i>=0;i--)
        {
            if(value(s[i])>=p)
            {
                ans+=value(s[i]);
            }
            else 
                ans-=value(s[i]);
            p=value(s[i]);    
        }
        return ans;
        
        }
        int value(char x)
        {
            if(x=='I')
                return 1;
            if(x=='V')
                return 5;
            if(x=='X')
                return 10;
            if(x=='L')
                return 50;
            if(x=='C')
                return 100;
            if(x=='D')
                return 500;
            if(x=='M')
                return 1000;
            else return 0;
        }
};
