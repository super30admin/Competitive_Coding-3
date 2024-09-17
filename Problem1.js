// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Adding to the set

var findPairs = function (nums, k) {
    if (!nums || nums.length === 0) return 0;
    let map = new Map();
    let set = new Set();
    for (let n of nums) {
        if (!map.get(n)) {
            map.set(n, 1)
        } else {
            map.set(n, map.get(n) + 1);
        }
    }

    for (let n of nums) {
        let comp = n - k;
        if (n !== comp) {
            console.log(map.has(comp));
            if (map.has(comp)) {
                set.add(n);
                // console.log(set);
            }

        } else {
            // console.log(nums, map.get(nums[i]));
            if (map.get(n) > 1) set.add(n);
            // console.log(set);
        }
    }
    return set.size;
};