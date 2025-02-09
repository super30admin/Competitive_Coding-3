// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Start by using hashmap so space complexity increased O(n)
// store the keys as the number and 

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findPairs = function(nums, k) {
    if (k < 0) return 0; // Absolute difference cannot be negative

    let map = new Map();
    let count = 0;

    // Count occurrences of each number
    for (let num of nums) {
        map.set(num, (map.get(num) || 0) + 1);
    }

    // Iterate over keys of the map
    for (let key of map.keys()) {
        if (k === 0) {
            if (map.get(key) >= 2) count++; // Count duplicates when k = 0
        } else {
            if (map.has(key + k)) count++; // Check for unique pairs
        }
    }

    console.log (count);
};

findPairs([3,1,4,1,5],2)
