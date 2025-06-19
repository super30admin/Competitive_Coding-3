
// TC: O(n)

//Space : O(1)

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode cur = head;

        // Step 1: Calculate length
        while (cur != null) {
            cur = cur.next;
            len++;
        }

        // Step 2: Move to middle
        ListNode start = head;
        int count = len / 2;
        while (count > 0) {
            start = start.next;
            count--;
        }

        // If length is odd, skip the middle node
        if (len % 2 != 0) {
            start = start.next;
        }

        // Step 3: Reverse second half
        ListNode prev = null;
        ListNode curr = start;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // Step 4: Compare both halves
        ListNode first = head;
        ListNode second = prev;
        for (int i = 0; i < len / 2; i++) {
            if (first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // Example: 1 -> 2 -> 3 -> 2 -> 1 => true
        ListNode node5 = new ListNode(1);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        PalindromeLinkedList sol = new PalindromeLinkedList();
        System.out.println("Is Palindrome? " + sol.isPalindrome(node1)); // Output: true
    }
}
