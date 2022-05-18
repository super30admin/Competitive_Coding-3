/ Time Complexity : O(nlogn) for sorting
// Space Complexity : O(1) for hashmap;
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findPairs = function(nums, k) {
    var map = new Map();
    var count=0;
    nums.sort((a,b)=>a-b);
    for(let i=0;i<nums.length;i++)
    {
        map.set(nums[i],map.get(nums[i])+1||1);
    }
    for(let [ky,vl] of map.entries())
    {   
        if(k!==0 && map.has(ky-k))
        {
           count++;
           map.delete(ky-k);
        }
        else if(k===0 && vl>=2)
        {
            count++;
            map.delete(ky);
        }
    }
   return count;
};
console.log(findPairs([1,2,3,4,5],1));