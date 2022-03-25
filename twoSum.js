// Time Complexity : O(n) where n is length of nums
// Space Complexity : O(n) where n is length of nums
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

// Storing all nums and their indexes in the Hashmap and 
// Subtracting num from target and looking for that vaue in the hashmap.
var twoSum = function(nums, target) {
    let hash1 = new Map();
    for(let i=0; i<nums.length; i++) {
        hash1.set(nums[i],i);
    }
    for(let i=0; i<nums.length; i++) {
        let value = target - nums[i];
        if(hash1.has(value) && hash1.get(value) != i) {
            let index = hash1.get(value);
            return [i,index];
        }   
    }
};