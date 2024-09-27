// Time Complexity : O(n) where n is length of numRows
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let result = [];
    result.push([1]);
    if(numRows === 1) return result;
    let a = 0;
    for(let i=1; i< numRows; i++) {
        let temp = [];
        temp.push(1);
        for(let j=1; j<i; j++) {
            temp.push(result[i-1][j] + result[i-1][j-1]);
        }
        temp.push(1);
        result.push(temp);
    }
    return result;
};