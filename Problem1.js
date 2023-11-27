//https://leetcode.com/problems/pascals-triangle/submissions/
//Accepted in LeetCode
// TC O(n^2) and SC O(n)



/**
 * @param {number} numRows
 * @return {number[][]}
 */


var generate = function(numRows) {

    let res=[]
    
    if(numRows >=1) res.push([1]);
    if(numRows >=2) res.push([1,1]);
    
    for(let i=2;i<numRows; i++){
    let first =1;
    let last=1;
    
    let prevArr = res[i-1]
    
    if(prevArr.length === 2){
        res.push([first, first+last, last])
    }else{
        let left=0;
        let right=1;
        let add=[];
    
        while(right< prevArr.length){
            add.push(prevArr[left]+prevArr[right])
            left++;
            right++;
        }
    
        res.push([first, ...add,last])
    }
    }
    return res;
    
    
    };