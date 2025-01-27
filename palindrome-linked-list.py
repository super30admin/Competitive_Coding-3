# tc O(n), sc O(1).
def get_first_half_end(self, head):
    slow = fast = head
    while fast.next and fast.next.next:
        slow = slow.next
        fast = fast.next.next
    return slow

def reverse_second_half(self, secondHead):
    prev = None
    curr = secondHead
    while curr:
        nxt = curr.next
        curr.next = prev
        prev = curr
        curr = nxt
    return prev

def isPalindrome(self, head: Optional[ListNode]) -> bool:
    # tc O(n), sc O(1).

    # find the middle node
    firstEnd = self.get_first_half_end(head)
    secondHead = firstEnd.next
    firstEnd.next = None

    # reverse the second half of linkedlist
    secondHead = self.reverse_second_half(secondHead)

    # compare and reverse back the second half
    prev2, curr2 = None, secondHead
    curr1 = head
    IS_PALINDROME = True

    while curr1 and curr2:
        if curr1.val != curr2.val:
            IS_PALINDROME = False
        curr1 = curr1.next

        nxt = curr2.next
        curr2.next = prev2
        prev2 = curr2
        curr2 = nxt
    
    firstEnd.next = prev2
    return IS_PALINDROME