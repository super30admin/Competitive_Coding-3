//K-diff Pairs in an Array

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

const findPairs = function(nums, k) {
    if(!nums || nums.length < 2) return 0;
    let count = 0;
    let map = new Map();
    if(k === 0) {
        for(let i = nums.length - 1; i >= 0; i--) {
            map.set(nums[i], (map.get(nums[i]) || 0) + 1);
        }
        for(let [k,v] of map) {
            if(v > 1) count++;
        }
        return count;
    }   
    for(let i = nums.length - 1; i >= 0; i--) {
        map.set(nums[i], (map.get(nums[i]) || 0) + 1);
        if(map.get(nums[i]) === 1) {         
            if( k > 0) {
                if(map.has(nums[i] - k)) count++;
                if(map.has(nums[i] + k)) count++;
            }           
        }
    }
    return count;
}

// -------------------------------------------------------------------------

// Pascal's Triangle

// https://leetcode.com/problems/pascals-triangle
// Time Complexity : O(n2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

var generate = function(numRows) {
    if(numRows < 1) return [];
    if(numRows === 1) return [[1]];
    if(numRows === 2) return [[1],[1,1]];
    let matrix = [[1],[1,1]];
      
    for(let i = 3; i <= numRows; i++) {
      let arr = matrix[matrix.length - 1];
      let retArr = [];
      retArr.push(1);
      for(let j = 1; j < arr.length; j++) {
          retArr.push(arr[j] + arr[j-1])
      }
      retArr.push(1);
      matrix.push(retArr);
    }
    return matrix;
  };