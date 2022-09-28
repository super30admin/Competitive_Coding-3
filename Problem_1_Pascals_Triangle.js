// Time Complexity : O(n^2) n is the numRows
// Space Complexity : O(1), the response array is not considered as space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function (numRows) {
    // Return array if numRows is 0,1 or 2
    if (numRows === 0) {
        return [];
    }
    if (numRows === 1) {
        return [[1]];
    }
    let ans = [[1], [1, 1]];
    if (numRows === 2) {
        return ans;
    }
    // Staring from row 3, we push 1st element 1
    // We start with the 1st element of previous row and add sum of ele and next ele in new array
    // We push last element 1 and then the new array in the answer
    for (let i = 2; i < numRows; i++) {
        let prevRow = ans[ans.length - 1];
        let tempArr = new Array();
        tempArr.push(1);
        for (j = 0; j < prevRow.length - 1; j++) {
            tempArr.push(prevRow[j] + prevRow[j + 1]);
        }
        tempArr.push(1);
        ans.push(tempArr);
    }
    return ans;
};