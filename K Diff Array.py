# Time Complexity : O(n)
# Space Complexity : O(n) to maintain the hash map

# The code ran on LeetCode

# Maintain a count of all the visited until now in a hash map. At every element in the nums array, check if the left pair or right pair exists. Add all the unique pairs to the res array. 
# Handle the case k = 0 separately. At most, an element can be added to the res only once in this case.
# Return the length of the res array

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        res = []
        d = {}
        for n in nums:
            if n not in d:
                # Check for left pair:
                if n-k in d and [n-k, n] not in res:
                    res.append([n-k, n])
                # Check for right pair
                if n+k in d and [n, n+k] not in res:
                    res.append([n, n+k])
                d[n] = 1
            else:
                d[n]+=1
                if k == 0 and d[n] >= 2 and [n, n] not in res:
                    res.append([n, n])
        return len(res)