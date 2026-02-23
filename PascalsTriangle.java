import java.util.*;

// O(n^2) time, O(1) space
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = ans.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1); // add 1 to beginning

            for (int j = 1; j < i; j++) {
                int mid = prev.get(j-1);
                int midNext = prev.get(j);
                curr.add(mid + midNext);
            }
            curr.add(1); // add 1 to end
            ans.add(curr);
        }
        return ans;
    }
}