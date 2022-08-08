# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if not nums:
            return
        
        h = {}
        sol = set() # Taking a solution set where we will add pairs. Taking set as duplicates will be ignored
        
        for i in range(len(nums)):
            if nums[i] not in h.keys():
                h[nums[i]] = 0
            h[nums[i]] += 1 # Store the count of the key as the value
        
        for i in h.keys():
            # Iterate through the hashmap instead of input array to reduce iterations when duplicates are invloved
            if k == 0:
                if h[i] > 1:
                    sol.add((i,i)) # If k = 0 then ckeck if the occurence of i is more than 1. Only if there are multiple i's we can add it gto the solution segt
            else:
            
                c1 = i-k # one complement is i - k | c1 is always less than i (as k>=0)
                c2 = i+k # other complement is i+k | c2 is always greater than i

                if c1 in h.keys():
                    sol.add((c1,i)) # Add (c1,i) to sol
                if c2 in h.keys():
                    sol.add((i,c2)) # Add (i,c2) to sol
        return len(sol) #Return len of sol as they asked the number of different pairs