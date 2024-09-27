// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



var generate = function(numRows) {
    if(!numRows) return []
    if(numRows === 1) return [[1]]
    else if(numRows ==2) return [[1],[1,1]]
    
    let output = [];
    for (let i = 0; i < numRows; i++) {
        output[i] = new Array(i+1).fill(1)
    }
    
    for(let j = 2; j < numRows; j++) {
        
        for(let k = 1; k < output[j].length - 1; k++){
            output[j][k] = output[j-1][k-1] + output[j-1][k]
        }
    }
    
    return output
};