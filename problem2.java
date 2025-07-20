// Time Complexity: O(n)
// Space Complexity: O(n)

// We first put all unique elements in a set, and add the duplicates to a duplicate set (in case of edge case k = 0). We perform another 1 pass and identify if n + k exists in the set. Return that count.

class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) duplicates.add(n);
        }
        int count = 0;
        for (int n : set) {
            if (set.contains(n + k)) count++;
        }

        if (k == 0) return duplicates.size();
        return count;
    }
}
