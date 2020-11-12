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
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode* S;
        ListNode* newhead=NULL;
        if(l1==NULL)
            return l2;
        if(l2==NULL)
            return l1;
        if(l1&&l2)
        {
            if(l1->val<=l2->val)
            {
                S=l1;
                l1=l1->next;
            }
            else{
                S=l2;
                l2=l2->next;
            }
            newhead=S;      ///important thing
            
        }
        while(l1&&l2)
        {
            if(l1->val<=l2->val)
            {
                S->next=l1;
                S=l1;
                l1=S->next;
            }
            else{
                S->next=l2;
                S=l2;
                l2=S->next;
            }
        }
        if(l1==NULL) S->next=l2;
        if(l2==NULL) S->next=l1;
        return newhead;
    }
};
