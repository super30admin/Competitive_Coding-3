// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode head2 = reverse(slow.next);
        // Checking if it is palindrome
        while(head != null && head2 != null) {
            if(head.val != head2.val) return false;
            else {
                head = head.next;
                head2 = head2.next;
            }
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
