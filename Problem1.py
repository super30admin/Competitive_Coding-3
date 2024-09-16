# Time Complexity :  O(nlogn)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

# K-diff Pairs in an Array

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hashmap = {}
        count = 0
        for i in nums:
            if i not in hashmap:
                hashmap[i] = 1
            else:
                hashmap[i] += 1

        for i in hashmap:
            if k != 0:
                if i+k in hashmap:
                    count += 1
            else:
                if hashmap[i] > 1:
                    count += 1
        return count
        
        # for i in nums:
        #     if k != 0:
        #         if i+k in hashmap and hashmap[i+k] != False:
        #             count += 1
        #             hashmap[i+k] = False
        #     else:
        #         if hashmap[i] != False and hashmap[i] >= 2:
        #             count += 1
        #             hashmap[i+k] = False
        # return count
