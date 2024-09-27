// Time Complexity : O(n) where n is length of nums
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Step 1 : Create a hash map for stirng number and index ref
// Step 2 : look for value+k element in hash map, if found increase count and delete value+k element from hash map

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findPairs = function(nums, k) {
    if(nums === 0 || nums.length === 0 || k < 0) return 0;
    let hash = new Map();
    let count = 0;
    for(let i=0; i < nums.length; i++) {
        hash.set(nums[i],i)
    }
    console.log(hash);
    for(let i=0; i < nums.length; i++) {
        if(hash.has(nums[i]+k) && hash.get(nums[i]+k) !== i) {
            count++;
            hash.delete(nums[i]+k);
        }
    }
    return count;
};