// Time Complexity : O(n log n)
// Space Complexity : O(1) - constant
// Did this code successfully run on Leetcode : Yes

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findPairs = function (nums, k) {
  let pointer1 = 0;
  let pointer2 = 0;
  let count = 0;

  nums.sort((a, b) => a - b);

  while (pointer1 <= nums.length - 1 && pointer2 <= nums.length - 1) {
    if (pointer1 === pointer2) {
      pointer2++;
    }

    if (nums[pointer2] - nums[pointer1] === k) {
      count++;
      pointer1++;
      pointer2++;
      while (
        pointer1 <= nums.length - 1 &&
        nums[pointer1] === nums[pointer1 - 1]
      ) {
        pointer1++;
      }
    } else if (nums[pointer2] - nums[pointer1] > k) {
      pointer1++;
    } else {
      pointer2++;
    }
  }
  return count;
};
