// Problem 1: https://leetcode.com/problems/pascals-triangle/description/
// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach: I have created a list of list to store the result. I have added the first row to the result list. Then I have iterated over the numRows and for each row I have created a new row and added it to the result list. I have added 1 to the start and end of each row and for the middle elements I have added the sum of the previous row elements at j-1 and jth index. Finally I have returned the result list.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0)
            return result;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);
            result.add(row);
        }
        return result;

    }
}

// Problem 2: https://leetcode.com/problems/pascals-triangle-ii/description/
// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach: The solution for
// finding k-diff pairs in an array involves using a HashMap to count the
// occurrences of each number. We then iterate over the keys of the map,
// checking for pairs with the specified difference \( k \); if \( k \) is zero,
// we count numbers that appear more than once, otherwise, we check if each key
// plus \( k \) exists in the map. The count of valid pairs is then returned.
class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (k == 0) {
                if (map.get(key) > 1) {
                    count++;
                }
            } else {
                if (map.containsKey(key + k)) {
                    count++;
                }
            }
        }
        return count;

    }
}