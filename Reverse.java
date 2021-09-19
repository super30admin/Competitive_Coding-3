/**
 * Reverse
 */
public class Reverse {

    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        if (head == null)
            return false;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        count = count / 2;
        ListNode fast = head;

        while (count > 0) {

            fast = fast.next;
            count--;
        }
        ListNode prev = null;
        ListNode next = fast.next;

        while (next != null) {
            fast.next = prev;
            prev = fast;
            fast = next;
            next = next.next;

        }
        fast.next = prev;

        while (fast != null) {
            if (head.val != fast.val)
                return false;
            fast = fast.next;
            head = head.next;
        }

        return true;

    }
}