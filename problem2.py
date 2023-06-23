class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        """
        Using Hash map to store frequency of each element.
        If the element + k is in the list then we shlould increment result by 1
        Time Complexity : O(N)
        sapce Complexity : O(N)
        """
        if len(nums) == 0: return 0
        
        fre_map = {}
        res= 0
        
        for i in range(len(nums)):
            if nums[i] in fre_map:
                fre_map[nums[i]] += 1
            else:
                fre_map[nums[i]] = 1
                
                  
        for  keys in fre_map:
            if k >0 and keys + k in fre_map:
                res += 1
            elif k == 0 and fre_map[keys] > 1:
                res +=1
                
        return res
