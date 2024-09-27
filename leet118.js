// Time Complexity : O(N^2) for brute force approach
// Space Complexity : O(N^2)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    var len = numRows;
    var arr=[];
    for(var i= 0;i<len;i++)
    {
      var ar=[];
     for(var j=0;j<=i;j++)
     {
         if(j===i || j===0)
          {
              ar[j]=1;
          }
         else
         {
             ar[j] = arr[i-1][j]+arr[i-1][j-1];
         }
          
     }
    (arr.push(ar));
    
    }
    return arr;
};