# time complexity : 0(n)
# space complexity : 0(n) 
class Solution(object):
    def findPairs(self, nums, k):
        
        n = len(nums)
        
        if n == 0:
            return 0
        
        mymap = {}
        
        for x in nums:
            if x not in mymap:
                mymap[x] = 1
            else:
                mymap[x] = mymap[x] + 1
                
        
        ans = 0
        
        for x in mymap:
            if k == 0:
                if mymap[x] >=2:
                    ans = ans + 1
            
            else: 
                if x+ k in mymap:
                    ans = ans + 1
            
                
        return ans