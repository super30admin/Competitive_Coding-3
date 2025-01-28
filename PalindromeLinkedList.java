/**
 * # Time complexity: O(n), where n is the number of nodes in the linked list, as we traverse the list multiple times.
 * # Space complexity: O(1), as no extra space is used apart from pointers for reversing the list.
 * # Leetcode: Yes
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        // Base case
        if (head == null || head.next == null) {
            return true;
        }

        // Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        ListNode head2 = reverse(slow);

        // Compare the first and second halves
        ListNode ptr1 = head;
        ListNode ptr2 = head2;

        while (ptr2 != null) {
            if (ptr1.val != ptr2.val) {
                return false;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        // Reverse the linked list
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev; 
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
