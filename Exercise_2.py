# Time Complexity: O(n)
# Space Complexity: O(n)
# Were you able to run the code on Leetcode: Yes
# Any problem you faced while coding this: No

from collections  import Counter
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:

        if k<0:
            return 0
        
        #store frequency of elements in nums in hashmap
        cnt = Counter(nums)

        res = 0

        # traverse the hashmap to avoid duplicates

        for i in cnt:

            # when duplicate values exist of a number then one unique pair is present which results 0 
            if k==0:
                if cnt[i] >=2:
                    res+=1
            else:
            # if a certain pair already exists in the map, then that element+k makes one pair
                if cnt.get(i+k,None) is not None:
                    res+=1

        return res
