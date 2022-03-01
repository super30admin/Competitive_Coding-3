// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null)
            return true;
        
        ListNode slow = head;
        ListNode fast = head;
        
        //find mid of linked list
        while(fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //slow points to middle
        
        //reverse 2nd half of linked list
        ListNode prev = null;
        ListNode curr = slow;
        ListNode temp;
        while(curr!=null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }//prev points to start of 2nd list
    
        ListNode first = head;
        ListNode second = prev;
        
        //compare first and second for pallindrome
        while(first!=null && second != null) {
            if(first.val == second.val) {
                first = first.next;
                second = second.next;
            } else {
                return false;
            }
        }
        
        return true;
    }
}