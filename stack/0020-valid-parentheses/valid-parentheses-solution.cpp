class Solution {
public:
    bool isValid(string s) {
        stack<char>q;
        if((s[0]==']')||(s[0]==')')||(s[0]=='}'))
            return false;
        for( auto x: s)
        {
            switch(x)
            {
                case '{':
                case '[':
                case '(':
                    q.push(x);
                    break;
                case '}':
                    if((q.empty())||(q.top()!='{'))
                        return false;
                    q.pop();
                    break;
                case ']':
                    if((q.empty())||(q.top()!='['))
                        return false;
                    q.pop();
                    break;
                case ')':
                    if((q.empty())||(q.top()!='('))
                        return false;
                    q.pop();
                    break;
            }
                    
        }
        return q.empty()?true:false;
    }
};
