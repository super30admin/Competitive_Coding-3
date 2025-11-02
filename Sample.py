# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : Yes


# // Your code here along with comments explaining your approach

# Used a **frequency map (Counter)** to efficiently find unique k-diff pairs:

# 1. **For k = 0**: Count how many numbers appear **at least twice** (since pairs must be `(x, x)`)
# 2. **For k > 0**: For each unique number `x`, check if `x + k` exists in the map (avoids duplicates by only checking one direction)

# **Key insight**: By only checking `x + k` (not `x - k`), you ensure each pair `(x, x+k)` is counted **exactly once**.

# - **Time Complexity**: `O(N)` — single pass through unique elements  
# - **Space Complexity**: `O(N)` — for the frequency map


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hashmap = Counter(nums)
        count=0
        res = []
        for key, value in hashmap.items():
            if k == 0:
                if value > 1:
                    if (key,key) not in res:
                        res.append([key,key])
                        count += 1
            else:
                if key + k in hashmap:
                    if sorted([key+k,key]) not in res:
                        res.append(sorted([key+k,key]))
                        count += 1
        print(res)       
        return count
        



