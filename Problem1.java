// Time Complexity : O(n) where n = length of linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.*;

// Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Problem1 {
    
    public static boolean isPalindrome(ListNode head) {
        // Split the linked list into 2 halves, the middle node will be end pointer of 1st half
        ListNode firsthalfendptr = splitIntoHalf(head);
        // Reverse 2nd half of the linked list
        ListNode reversedSecondHalfHead = reverse(firsthalfendptr.next);
        // Set curr1 and curr2 pointers to heads of first half and second half of linked list respectively
        ListNode curr1 = head, curr2 = reversedSecondHalfHead;
        // Advance both curr1 and curr2 pointers simultaneously by 1 node through both the halves 
        while (curr1 != null && curr2 != null) {
            // Return false if values of curr1 and curr2 don't match
            if (curr1.val != curr2.val) {
                return false;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        // If everything matches, return true
        return true;
    }
    
    // Function to find middle node of the linked list
    private static ListNode splitIntoHalf(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    // Function to reverse a linked list
    private static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode makeLinkedList(int[] arr) {
        ListNode head = null;
        for (int i = 0; i < arr.length; i++)
            head = insertNode(head, arr[i]);
        return head;
    }

    private static ListNode insertNode(ListNode head, int val) {
        ListNode temp = new ListNode(val);
        if (head == null)
            head = temp;
        else {
            ListNode curr = head;
            while (curr.next != null)
                curr = curr.next;
            curr.next = temp;
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode curr = head;
        List<Integer> ans = new ArrayList<Integer>(); 
        while (curr != null) {
            ans.add(curr.val);
            curr = curr.next;
        }
        System.out.println(ans);
    }
 
    public static void main(String args[]) {
        int arr[] = {1,2,2,1};
        ListNode head = makeLinkedList(arr);
        // printLinkedList(head);
        boolean ans = isPalindrome(head);
        System.out.println(ans);
    }

}
