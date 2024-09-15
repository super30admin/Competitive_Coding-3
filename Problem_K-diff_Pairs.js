// Time Complexity : O(n), n is the length of nums
// Space Complexity : O(n), n is the length of nums
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
HashMap
number => Occurences

case 1, k===0
if(occurence>1)
    counter++
    delete the number from HM

case 2,
x=k-y || x=y-k {
counter++
delete the y from HM
}

*/

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findPairs = function (nums, k) {
    if (nums === null || nums.length === 0) {
        return 0;
    }
    let map = new Map();
    for (let i = 0; i < nums.length; i++) {
        let num = nums[i];
        if (map.has(num)) {
            map.set(num, map.get(num) + 1);
        } else {
            map.set(num, 1);
        }
    }
    let counter = 0;
    map.forEach((value, key) => {
        // case 1, k===0
        if (k === 0) {
            if (value > 1) {
                counter++;
            }
        } else {
            // key = 3
            // 3-2 || 2+3
            // x=k+key || x=key-k
            let pair1 = map.has(key - k);
            let pair2 = map.has(key + k);
            if (pair1) {
                counter++;
            }
            if (pair2) {
                counter++;
            }
            map.delete(key);
        }
    })
    return counter;
};
