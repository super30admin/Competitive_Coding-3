// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach


public class PalindromeLinkedList{
    public boolean isPalindrome(ListNode head) {
        if(head==null ) return false;
        if( head.next==null) return true;
        
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
         fast=reversed(slow.next);
        slow.next=null;
        slow=head;
        while(fast!=null && slow!=null){
            if(slow.val!=fast.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
    ListNode reversed(ListNode root){
        if(root==null || root.next==null) return root;
        ListNode curr=root;
        ListNode forward=root.next;
        ListNode prev=null;
        while(forward!=null){
            curr.next=prev;
            prev=curr;
            curr=forward;
            forward=forward.next;
        }
        curr.next=prev;
        return curr;
    }
}