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
    ListNode* deleteDuplicates(ListNode* head) {
        if(head==NULL)
            return NULL;
        ListNode* curr=head; 
        ListNode* nxt=curr->next;
        if(nxt==NULL)
            return head;
        while(nxt)
        {

            if(curr->val==nxt->val)
            {
                curr->next=nxt->next;
                nxt=curr->next;    
            }
            else
            {
                curr=nxt;
                nxt=curr->next;
            }
                
        }
        return head;
        
    }
};
