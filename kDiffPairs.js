// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

var findPairs = function(nums, k) {
    var obj = {};
    var count = 0;
    //Add number and count into a hashtable
    nums.forEach(ele => {
        if(obj[ele] != undefined) obj[ele] += 1;
        else obj[ele] = 1;
    })
    //Loop through the keys and check if the sum o of two numbers become k
    // if k=0 then to we need two of the same numbers to make it 0 therefore we increase the count if there are 2 of the same number in the hashtable
    Object.keys(obj).forEach(key => {
        if(k==0 && obj[key]>=2) {
            count++;
            obj[key] -=2;
        } 
        else if(k>0 && obj[key-k]!=undefined && obj[key-k]>=1) {
            obj[key-k] -= 1;
            count ++;
        } 
    })
    
    return count;
};
