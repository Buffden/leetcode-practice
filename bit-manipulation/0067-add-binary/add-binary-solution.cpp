class Solution {
public:
    string addBinary(string a, string b) {
        int n=a.size(),m=b.size();
        string temp="";
        if(n>m)
        {
            for(int i=0;i<n-m;i++)
                temp+="0";
            temp+=b;
            b=temp;
        }
        else if(n<m)
        {
            for(int i=0;i<m-n;i++)
                temp+="0";
            temp+=a;
            a=temp;
        }
        int i=a.size(), carry=0;
        string ans="";
        while(i>=0)
        {
            if((a[i]=='1')&&(b[i]=='1'))
            {
                if(carry==1)
                    ans+="1";
                else 
                {
                    carry=1;
                    ans+="0";
                }
            }
            else if((a[i]=='0')&&(b[i]=='0'))
            {
                if(carry==1)
                {
                    ans+="1";
                    carry=0;
                }
                else 
                    ans+="0";
            }
            else if(((a[i]=='1')&&(b[i]=='0'))||((a[i]=='0')&&(b[i]=='1')))
            {
                if(carry==1)
                    ans+="0";
                else                        
                    ans+="1";
            }
            i--;
        }
        if(carry==1)
            ans+="1";
        reverse(ans.begin(),ans.end());
        return ans;
    }
};
