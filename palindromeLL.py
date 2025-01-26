# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if not head:
            return False
        if not head.next:
            return True
        curr=head
        dummy = ListNode(-1)
        currnew=dummy
        while curr:
            newNode= ListNode(curr.val)
            currnew.next=newNode
            currnew=newNode
            curr=curr.next
        prev= None
        curr=dummy.next
        dummy.next = None
        cnext = curr.next
        while cnext:
            curr.next = prev
            prev= curr
            curr= cnext
            cnext = curr.next
        curr.next = prev
        head1=head
        head2 = curr
        while head1:
            if head1.val!=head2.val:
                return False
            head1=head1.next
            head2=head2.next
        return True

