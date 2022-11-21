'''
Time Complexity -->
O(n)

Space Complexity -->
O(n) for hashmap
'''

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        dit = {}
        c = 0
        nums.sort()
        #print(nums)
        for i in nums:
            if i-k not in dit:
                dit[i]=1
            else:
                
                if dit[i-k]>0:
                    c+=1
                    dit[i-k]-=1
                if i not in dit:
                    dit[i]=1
        #print(dit)
        return(c)
            
        