//https://leetcode.com/problems/k-diff-pairs-in-an-array/submissions/
// Accepted in LeetCode
//tC is O(n) and sc is O(n)


/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findPairs = function(nums, k) {
    
    let set = new Set(nums);

    let res=0;
    for(let num of set){
        let target = num+k;
        if(set.has(target))
        res++
    }
 // edge case when the target is zero, check for duplicates
    if(k==0){
        let res=0;
        count ={};

        for(let num of nums){
            count[num] = count[num] || 0;
            count[num]++;

            if(count[num] == 2)
            res++
        }
        return res;
    }

    return res;

};