# // Time Complexity :O(n)-> n/2 for mid +n/2 for reverse + n for compare
# // Space Complexity :O(h) for reverse
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :If you take slow.next instead of slow, you lose midpoint.


# // Your code here along with comments explaining your approach
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if head is None :                   # Empty list                   
            return True
        
        #Find mid point
        slow = head
        fast = head
        while fast and fast.next:          
            slow = slow.next
            fast = fast.next.next

        #//dont break here This step creates error with reverse function slow.next = None
        head2 = self.reverse(slow)         # slow is on mid point, reverse it(dont lose the midpoint)
             
        # Compare the 2 Linked lists
        while head and head2:
            if head.val != head2.val:       
                return False
            head = head.next
            head2 = head2.next 
        return True
    
    # Reverse the linked list
    def reverse(self,head):
        prev = None
        curr = head
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        return prev