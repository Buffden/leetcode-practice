/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        
        /*
        first we find the middle of the list 
        then ignore the mid term if odd numbers are there in the list 
        split the list into two 
        reverse the second list 
        compare the two lists now
        */
        ListNode* slow = head;
        ListNode* fast = head;
        stack<int> st;
        while(fast && fast->next)
        {
            slow = slow->next;
            fast = fast->next->next;
        }
        
        ListNode* firstHalf = head;
        ListNode* secondHalf;
        
        if(fast)
            secondHalf = slow->next;
        else
            secondHalf = slow;
        
        while(firstHalf != slow)
        {
            st.push(firstHalf->val);
            firstHalf = firstHalf->next;
        }
        
        while(secondHalf)
        {
            if(st.empty() || st.top() != secondHalf->val)
                return false;
            
            st.pop();
            secondHalf = secondHalf->next;
        }
        
        return true;
    }
};
