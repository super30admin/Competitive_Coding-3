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
        // T.C: O(n)
        // S.C: O(1)    
        if (head == null || head.next == null)
            return true;
        
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while(current != null) {
            list.add(current.val);
            current = current.next;
        }
        
        int i = 0;
        int j = list.size() - 1;
        while (i <= j) {
            if(!list.get(i).equals(list.get(j)))
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}

// Executed