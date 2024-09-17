""" 
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
Solve it in O(n) time and O(1) space.

Time Complexity: O(N)
Space Complexity: O(1)
"""

def isPalindrome(head):
    
    def find_mid(head):
        slow, fast = head, head
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
        return slow
        
    def reverse_list(head):
        
        prev, curr, fast = None, head, head.next
        
        while fast:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
            
        curr.next = prev
        
        return curr
    
    mid = find_mid(head)
    head2 = reverse_list(mid)
    
    while head and head2:
        if head.val != head2.val:
            return False
        
        head = head.next
        head2 = head2.next
    
    return True                    
