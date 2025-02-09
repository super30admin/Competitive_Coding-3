// Time Complexity : O(N)
// Space Complexity : O(1)
class Solution {
    public boolean isPalindrome(ListNode head) {
        // TC = O(N), SC = O(1), reverse 2nd half, compare 1st & 2nd half
        // null
        if(head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) { // reach mid
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = reverse(slow.next); // reversing the 2nd half
        slow.next = null; // dividing the LL into 2
        slow = head; // taking slow to the start
        while(fast != null) { 
            if(slow.val != fast.val) return false; // checking the vals
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null, curr = head, fast = head.next;
        while (fast != null) {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}
