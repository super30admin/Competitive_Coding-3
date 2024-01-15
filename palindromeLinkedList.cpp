// Time Complexity : O(n) n is number of nodes in the list
// Space Complexity : O(n) auxillary space by stack to reverse half of the list
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Definition for singly-linked list.
 struct ListNode {
     int val;
      ListNode *next;
      ListNode() : val(0), next(nullptr) {}
      ListNode(int x) : val(x), next(nullptr) {}
      ListNode(int x, ListNode *next) : val(x), next(next) {}
  };
 
class Solution {
private:
    bool isPalindromeHelper(ListNode* tail,ListNode* &head) 
    {
        if(tail==nullptr)
        {
            return true;
        }
        bool ans = isPalindromeHelper(tail->next,head);
        if((head->val==tail->val) && ans)
        {
            head = head->next;
            return true;
        }
        else
            return false;
    }
    ListNode* reverse(ListNode* head)
    {
        if(head->next==nullptr)
        {
            return head;
        }
        ListNode* newHead = reverse(head->next);
        head->next->next = head;
        head->next = nullptr;
        return newHead;
    }
public:
    bool isPalindrome(ListNode* head) 
    {
       //return isPalindromeHelper(head,head);
        if(head==nullptr|| head->next==nullptr)
            return true;
        ListNode* slow = head;
        ListNode* fast = head;

        while(fast->next!=nullptr&&fast->next->next!=nullptr)
        {
            slow=slow->next;
            fast=fast->next->next;
        }
        fast = reverse(slow->next);
        slow->next = nullptr;
        slow = head;
        while(fast!=nullptr)
        {
            if(slow->val==fast->val)
            {
                slow=slow->next;
                fast=fast->next;
            }
            else
                return false;
        }
        return true;



    }
};