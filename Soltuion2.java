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
/*
    Time Complexity : O(n)
    Space Complexity : O(n)
*/
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        LinkedList<ListNode> stack = new LinkedList<>();
        while(temp!=null){
            stack.addFirst(temp);
            temp = temp.next;
        }
        
        while(head!=null && stack.size()>0){
            if(head.val!=stack.removeFirst().val){
                return false;
            }
            
            head = head.next;
        }
        
        return true;
    }
}
