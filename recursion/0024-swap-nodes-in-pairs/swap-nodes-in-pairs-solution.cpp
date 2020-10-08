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
/*
class Solution {
public:
    void _swapPairs(ListNode* odd, ListNode* even, ListNode** prev) {
        if (!odd || !even) return;
        *prev = even;
        ListNode* temp = even->next;
        even->next = odd;
        odd->next = temp;
        _swapPairs(odd->next, odd->next ? odd->next->next: NULL, &odd->next);
    }
    ListNode* swapPairs(ListNode* head) {
        _swapPairs(head, head ? head->next : NULL, &head);
        return head;
    }
};
*/
class Solution{
public:
    void swapair(ListNode* odd, ListNode* even, ListNode** prev){
        if(!odd||!even)
            return;
        *prev=even;
        ListNode *temp=even->next;
        even->next=odd;
        odd->next=temp;
        swapair(odd->next,odd->next?odd->next->next:NULL,&(odd->next));
    }
    ListNode* swapPairs(ListNode* head) {
        swapair(head, head ? head->next : NULL, &head);
        return head;
    }
};

