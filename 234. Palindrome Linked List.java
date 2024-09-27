class Solution {
    // Time complexity: O(n)
    // Space complexity: O(1)
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode head2 = findMid(head);
        ListNode newHead = reverse(head2);
        while(newHead != null){
            if(head.val != newHead.val){
                return false;
            }
            head = head.next;
            newHead = newHead.next;
        }
        return true;
        
    }
    public ListNode findMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        return newHead;
    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}