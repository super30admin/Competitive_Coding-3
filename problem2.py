// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
from collections import Counter
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        cnt=0
        dictionary=Counter(nums)                                          //create dictionary in which key is nums[i] and value is count
        print((dictionary))
        
        for x in dictionary:                  //traverse the dictionary
            if k>0 and k+x in dictionary:       //check if current key +k is also in dictionary it means that it is the required pair
                cnt+=1
            elif k==0 and dictionary[x]>1:        //this case is to check if difference of 0 is there in two numbers ie., to check if number is reapeated or no
                cnt+=1
        return cnt
