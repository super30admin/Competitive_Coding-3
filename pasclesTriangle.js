// Time Complexity : O(n*m)
// Space Complexity : O(n*m)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/* 
1. We can observe that the entier left and right side of the triangle is 1
2. Meaning the last and first values of an array are 1
3. The remaining values in the middle are equal to the value of the array before with current index + current index-1
*/

// Your code here along with comments explaining your approach

var generate = function(numRows) {
    var result = [];
    var firstEle = [1];
    result.push(firstEle);
    
    for(let i=1;i<numRows; i++) {
        let currentRow = new Array(i+1);
        let layerBefore = result[result.length-1];
        currentRow[0] = 1;
        currentRow[i] = 1;
        
        for(let j=1;j<i;j++) {
            currentRow[j] = layerBefore[j-1] + layerBefore[j];
        }
        
        result.push(currentRow);
    }
    
    return result;
};
