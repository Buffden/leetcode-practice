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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(!head->next&&n==1)
            return NULL;
        int count=0;
        ListNode* curr=head;
        ListNode* prev=NULL;
        while(curr!=NULL)
        {
            count++;
            curr=curr->next;
        }
        curr=head;
        if(n==1)
        {
            while(curr->next!=NULL)
            {
                prev=curr;
                curr=curr->next;
            }
            prev->next=NULL;
            return head;
        }
        curr= head;
        while(count!=n)
        {
            prev=curr;
            curr=curr->next;
            count--;
        }
        if(curr->next==NULL)
            prev->next=NULL;
        curr->val=curr->next->val;
        curr->next=curr->next->next;
        return head;
    }
};
