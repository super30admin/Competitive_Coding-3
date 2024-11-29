/*
Time complexity : O(n), where n is the number of nodes in the Linked List.
Finding the middle is O(n), reversing a list in place is O(n), and then comparing the 2 resulting Linked Lists
is also O(n) => O(n) + O(n) + O(n) = O(3n) = O(n)

Space complexity : O(1) as we are not using any auxiliary data structure

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
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head)
    {
        //base case
        if(head == null) return true;

        //logic
        ListNode slow = head;
        ListNode fast = head;

        //Finding the mid of the list
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Now we will be having the mid point at slow
        ListNode head2 = slow.next; //slow.next here is the midpoint
        slow.next = null;

        /*
          1 -> 2 -> 2 -> 3 -> 2 -> 2 -> 1 -> null (3 is midpoint which is also slow)

          After finding the midpoint
          left sublist  = 1 -> 2 -> 2 -> 3 -> null (3 is head2)
          right sublist = 2 -> 2 -> 1 -> null
        */

        /*
            Now we need to reverse the right sublist to compare it with left sublist, make head2 point to the reversed list first node
            meaning now it is pointing 2 make it point to 1
        */
        head2 = reverseList(head2);

        //After getting the reverse list, check whether elements in both the list are equal
        while(head != null && head2 != null)
        {
            if(head.val != head2.val) {
                return false;
            }

            head = head.next;
            head2 = head2.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode head)
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