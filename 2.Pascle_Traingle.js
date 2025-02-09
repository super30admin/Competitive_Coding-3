// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

//1. While building pascal triangle create 2 nested for loops and 2D array keep adding the values 
//2. Draw the diagram for better understanding.
/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    if (numRows===0){
        return [];
    }
    let res =[[1]];
    for (let i =0; i<numRows-1;i++){
        let temp= [0,...res[res.length-1],0]
        let rows=[]
        for(let j =0 ; j<res[res.length-1].length+1;j++){
            rows.push(temp[j]+temp[j+1])
        }
        res.push(rows)
    }
    console.log(res)
};

generate(5)