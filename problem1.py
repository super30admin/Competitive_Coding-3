"""
Time Complexity: O(N) Linear looping through the array
Space Complexity: O(N) Linear for both hashmap and set

"""

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        

        hm = {}
        for i, num in enumerate(nums): 
            hm[num] = i 

        ans = set()
        for i, x in enumerate(nums): 
            
            if x-k in hm and i != hm[x-k]:
                if x-k > x: 
                    res = (x, x-k)
                else: 
                    res = (x-k, x) 
                ans.add(res)

            if x+k in hm and i!= hm[x+k]: 
                if x+k > x: 
                    res = (x, x+k)
                else: 
                    res = (x+k, x) 
                ans.add(res)

        return len(ans)

        
