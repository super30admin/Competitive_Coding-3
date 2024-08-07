#// Time Complexity : O(N) 
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no because i saw the class video and then did the problem.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if head is None:
            return True
        slow=head
        fast=head
        
        while fast.next!=None and fast.next.next!=None:
            fast=fast.next.next
            slow=slow.next
        prev=None
        curr=slow.next

        while curr:
            temp=curr.next
            curr.next=prev
            prev=curr
            curr=temp
        
        slow.next=None
        slow=head

        while slow!=None and prev!=None:
            if slow.val!=prev.val:
                return False
            slow=slow.next
            prev=prev.next
        return True

# Approach:
# 1. First, we check if the linked list is empty. If it is, we return True
# 2. We initialize two pointers, slow and fast, to the head of the linked list. The
# fast pointer moves twice as fast as the slow pointer. When the fast pointer reaches the end of the
# linked list, the slow pointer will be at the middle of the linked list.
# 3. We reverse the second half of the linked list using a temporary pointer, temp. We keep
# track of the previous node in the reversed list using the prev pointer.
# 4. We then merge the first half and the reversed second half of the linked list by setting the
# next pointer of the slow pointer to None. We also set the slow pointer to the head of the
# linked list.
# 5. We then compare the nodes of the first half and the reversed second half of the linked list
# 6. If all nodes match, we return True; otherwise, we return False.
