# Time Complexity: O(n)
# Space Complexity: O(1)

lass Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        res = 0
        dict = {}
        for i in range(len(nums)):
            if nums[i] in dict:
                dict[nums[i]] +=1
            else:
                dict[nums[i]] = 1
                
        for x in dict:
            if k>0 and x+k in dict:
                res +=1
            elif k ==0 and dict[x]>1:
                res+=1
        return res
        
