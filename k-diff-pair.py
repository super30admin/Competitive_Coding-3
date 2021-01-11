class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        '''
        Time Complexity: O(n)
        Space Complexity: O(n)
        '''
        if(nums==None or len(nums)<2):
            return 0
    
        x = {}
        c = set()
        for i in range(0,len(nums)):
            if(nums[i] in x.keys()):
                x[nums[i]].add(i)
            else:
                x[nums[i]] = set([i])

        for i in range(0,len(nums)):
            comp = k + nums[i]

            if(comp in x.keys()):
                ind = x[comp]
                if(len(ind)>1 and i in ind) or (i not in ind):
                    c.add(tuple(sorted([nums[i],comp])))

        return len(c)
