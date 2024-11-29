/*
Time complexity : O(n). List of n nodes, traverse over each node once

Space complexity : O(n)
The extra space comes from implicit stack space due to recursion. The recursion could go up to n levels deep. Means,
so list of length n we make n recursive calls.

Did this code successfully run on Leetcode: Yes
*/

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
class ReverseLinkedListRecursive {
    public ListNode reverseList(ListNode head)
    {
        //base case
        if( head == null || head.next == null) return head;

        //logic
        ListNode reverseSubListHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return reverseSubListHead;
    }
}