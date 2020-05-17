// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach:
we used two pointers low and high.
1)if nums[high]-nums[low]==k then we add it to the result.
2)If nums[high]-nums[low] is greater than k we have to increase low to make the difference near to k.
3)If the above does not satisfy then we increment the high pointer.


#Time complexity --> o(n)
#space complexity --> o(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums=sorted(nums)
        low=0
        high=low+1
        # count=0
        res=set()
        while low<=high and low<len(nums) and high<len(nums):
            # print(low,high)
            #take the example [1,1,1,2,2] target=0
            #we start low=0 and high=1
            #we check the if nums[high]-nums[low]==target we add it to the set.we used set to prevent duplicates from occuring.
            #if the difference between these numbers is greater than target we need to decrease the value so we increment the low value else we increment high pointer.
            #when low and high are equal we might be considering these elements so we have to skip these values so we used the below.
            #for instance at index 3 low and high pointers will meet for the above example.inorder to get rid of the above values we took this into consideration.
            if low==high:
                high=high+1
                continue
             
            if nums[high]-nums[low]==k:
                res.add((nums[low],nums[high]))
                low=low+1
                high=high+1
            elif nums[high]-nums[low]>k:
                low=low+1
            else:
                high=high+1
        print(res)
        return len(res)