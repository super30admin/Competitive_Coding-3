# https://leetcode.com/problems/k-diff-pairs-in-an-array/

# Time Complexity : O(n * nlogn)
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        arr=sorted(nums)
        n=len(arr)
        low=0
        high=0
        count=0
        while low<n and high<n:
            if low==high or arr[high]-arr[low]<k:
                high+=1
            elif arr[high]-arr[low]>k:
                low+=1
            else:
                count+=1
                low+=1
                high+=1
                while high<n and arr[high]==arr[high-1]:
                    high+=1
        return count
                    
                
        
        
