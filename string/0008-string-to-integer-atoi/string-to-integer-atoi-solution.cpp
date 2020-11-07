class Solution {
public:
    int myAtoi(string str) {
        int64_t num = 0;
        int i = 0, size = str.size();
        bool neg = false;
        while(str[i] == ' ') ++i;
        
        if(!isdigit(str[i])) {
            if(str[i] == '+' || str[i] == '-') {
                if(str[i] == '-') neg = true;
                ++i;
            } else return 0;
        }
        for(; i < size; ++i) {
            if(!isdigit(str[i])) break;
            else {
                num *= 10;
                num += str[i] - '0';
                if(!neg && num >= INT32_MAX) return INT32_MAX;
                if(neg && (num*-1) <= INT32_MIN) return INT32_MIN;
            }
        }
        
        return neg ? -1*num : num;
    }
};
