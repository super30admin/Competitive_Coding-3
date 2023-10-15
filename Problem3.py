'''
Approach 1: 
1. Reverse the first half of the linked list using slow, fast, temp and reversed_list pointers.
2. Move fast pointer to the end of the list and slow pointer to the middle of the list based on whether fast is None(Even length) or fast is the last node in the list (Odd Length).
3. Now our reversed_list points to the last node of the first half of the list and slow points to the first node of the second half of the list.
4. Run a loop until reversed_list is None or if any of the values are not equal. Check if reversed_list is None. If yes, then return True else return False.

TC: O(N)
SC : O(1)
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:

        slow = fast = head
        reversed_list = None
        
        while fast and fast.next:
            temp = slow

            slow = slow.next
            fast = fast.next.next

            temp.next = reversed_list
            reversed_list = temp

        if fast:
            slow = slow.next
        
        while reversed_list and reversed_list.val == slow.val:
            reversed_list = reversed_list.next
            slow = slow.next
        
        return True if not reversed_list else False

'''
Approach 2:
1. We recursively reach the end of list and then start comparing the values of the current node with node pointed by p.
2. At every call if the values of current and p are not equal then return False else return True and move pointer p to next node.
3. Each time, p and current are pointing to mirror nodes in the list. So we can compare the values of the nodes.

TC: O(N)
SC : O(N) - Recursive stack

'''
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        self.p = head

        def recursive_check(current):
            if current:
                if not recursive_check(current.next):
                    return False
                if self.p.val != current.val:
                    return False
                self.p = self.p.next
            return True
        
        return recursive_check(head)

