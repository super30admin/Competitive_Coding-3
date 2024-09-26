// Problem1 - Pascal's triangle
// Time Complexity : O(n x n) where n = num of rows
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Algorithm
// 1 - loop over number of rows
// 2 - loop over every element in the row to find its sum
// 3 - if first or last element, add 1
// 4 - for middle elements, sum of previous row's above elements
class Solution {
  public List<List<Integer>> generate(int numRows) {
    if (numRows == 0) {
      return new ArrayList<>();
    }
    List<List<Integer>> result = new ArrayList<>();
    
    // 1
    for (int i=0; i<numRows; i++) {
      List<Integer> list = new ArrayList<>();
      // 2
      for (int j=0; j<i+1; j++) {
        // 3
        if (j == 0 || i == j) {
          list.add(1);
        } else { // 4
          int num = result.get(i - 1).get(j) + result.get(i - 1).get(j - 1);
          list.add(num);
        }
      }
      result.add(list);
    }

    return result;
  }
}

// Problem2 - K-diff Pairs in an Array
// Time Complexity : O(n x nlogn) where n = array length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Algorithm
// 1 - sort array
// 2 - initiliaze pointers
// 3 - while condition
// 4 - check if pointing to same element, then increment j
// 5 - check if j is out of bounds
// 6 - if same element, increment pointer i
// 7 - if same element, increment pointer j
// 8 - get diff and compare with target
// 9 - if diff less than target, increment j else i
class Solution {
  public int findPairs(int[] nums, int k) {
    if (nums == null || nums.length == 0 || k < 0) {
        return 0;
    }
    // 1
    Arrays.sort(nums);
    // 2
    int i = 0;
    int j = 1;
    int count = 0;
    // 3
    while (j < nums.length) {
      // 4
      if (i == j) {
        j++;
      }
      // 5
      if (j >= nums.length) {
        break;
      }
      // 6
      while (i < j - 1 && nums[i] == nums[i + 1]) {
        i++;
      }
      // 7
      while (j < nums.length - 1 && nums[j] == nums[j + 1]) {
        j++;
      }
      // 8
      int diff = Math.abs(nums[i] - nums[j]);
      if (diff == k) {
        count++;
        i++;
        j++;
      } else if (diff < k) { // 9
        j++;
      } else {
        i++;
      }
    }

    return count;
  }
}
