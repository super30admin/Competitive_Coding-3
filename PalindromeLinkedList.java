/*
Time Complexity: O(n)
Space Complexity: O(1)
Code run on Leetcode: yes

Approach
1. Find out the mid using fast and slow pointer
2. reverse a half of the linkedlist
3. Compare values of the linkedLists if not equal return true otherwise return true
 */
public class PalindromeLinkedList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public static boolean palindromList(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!= null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reversedList = reverseLinkedList(slow.next);

        while(head!= null && reversedList!= null){
            if(head.val!= reversedList.val){
                return false;
            }
            head = head.next;
            reversedList = reversedList.next;
        }
        return true;
    }
    public static ListNode reverseLinkedList(ListNode node){
        ListNode prev = null;
        while(node!= null){
            ListNode curr = node.next;
            node.next = prev;
            prev = node;
            node = curr;
        }
        return prev;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(1);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = null;

        System.out.println(palindromList(head));

    }
}
