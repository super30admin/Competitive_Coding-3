class Solution {
    public void reorderList(ListNode head) {
        ArrayList<Integer> lt = new ArrayList<>();
        ArrayList<Integer> lt2 = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            lt.add(temp.val);
            temp = temp.next;
        }
        int sz = lt.size() - 1;
        int j = 0;

        for (int i = 0; i < lt.size(); i++) {
            if (i % 2 == 0) {
                lt2.add(lt.get(j));
                j++;
            } else {
                lt2.add(lt.get(sz));
                sz--;
            }
        }

        j = 0;
        temp = head;
        while (temp != null) {
            temp.val = lt2.get(j);
            j++;
            temp = temp.next;
        }
    }
}