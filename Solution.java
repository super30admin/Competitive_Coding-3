import java.util.*;

class Solution {

    // TC: O(n) SC: O(n)
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                }

            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }

    // TC: O(numRows^2) SC: O(numRows^2)
    public static List<List<Integer>> generatePascalsTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(1));

        if (numRows == 1)
            return triangle;
        triangle.add(Arrays.asList(1, 1));
        if (numRows == 2)
            return triangle;

        for (int i = 2; i < numRows; i++) {
            List<Integer> prevRowItems = new ArrayList<>();
            List<Integer> currRowItems = new ArrayList<>();
            int sum = 0;
            prevRowItems = triangle.get(i - 1);

            currRowItems.add(1);
            for (int j = 1; j < i; j++) {
                sum = prevRowItems.get(j - 1) + prevRowItems.get(j);
                currRowItems.add(sum);
            }
            currRowItems.add(1);
            triangle.add(currRowItems);
        }
        return triangle;
    }
}