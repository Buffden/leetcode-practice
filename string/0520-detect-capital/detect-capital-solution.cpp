class Solution {
public:
    bool detectCapitalUse(string word) {
        string a=word;
        int count =0,len=0,i=0;
        while(a[i]!='\0')
        {
            len++;
            i++;
        }
        for(int i=0;i<len;i++)
            if((a[i]>='A')&&(a[i]<='Z'))
                count++;
        if(len==count)
            return true;
        else if(count==0)
            return true;
        else if((count==1)&&((a[0]>='A')&&(a[0]<='Z')))
            return true;
        else return false;
    }
};
