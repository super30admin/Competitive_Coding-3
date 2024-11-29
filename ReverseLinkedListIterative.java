/*
Time complexity : O(n). List of n nodes, traverse over each node once

Space complexity : O(1).

Did this code successfully run on Leetcode: Yes
*/

//Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class ReverseLinkedListIterative {
    public ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null)
        {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }
}
