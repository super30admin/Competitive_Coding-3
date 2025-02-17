// Time complexity:- O(n)
// Space complexity:- O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach 
/**
 * Approach:
 * In this problem, I used the slow and fast pointer technique to find the middle of the linked list. 
 * After identifying the middle, I reversed the second half of the list and compared it with the first half node by node. 
 * If the values of corresponding nodes match, the list is a palindrome; otherwise, it is not. 
 */ 
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        // Find the middle of the linked list using the slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;

        // Move slow pointer one step and fast pointer two steps at a time
        while(fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Now slow is at the middle of the list
        if(fast == null) {
            pre.next = null;
        } else {
            pre = slow;
            slow = slow.next;
            pre.next = null;
        }
        // Reverse the list
        ListNode cur2 = reverse(slow);
        ListNode cur1 = head;

        // Compare the two list if they are palindrom
        while(cur2 != null) {
            // If the values of the nodes from the first and second half do not match, return false
            if(cur1.val != cur2.val) {
                return false;
            }
            // Move both pointers forward to continue the comparison
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        // If both list have same value, the list is a palindrome
        return true;
    }

    // helper method for reverse the list
    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while(cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}