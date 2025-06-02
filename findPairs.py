# Space complexity - o(n)
# Time Complexity - o(n)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        hashtb = {}

        n = len(nums)
        final_set = set()
        
        for i in range(n):
            if nums[i] in hashtb:
                hashtb[nums[i]]+=1
            else:
                hashtb[nums[i]]=1

        for i in range(n):

            if k == 0:
                if hashtb[nums[i]]>=2:
                    temp = [nums[i],nums[i]]
                    temp.sort()
                    final_set.add(tuple(temp))
                    
            else:
                if nums[i]-k in hashtb:
                # if nums[i] - k == hashtb[nums[i]-k] and 
                    temp = [nums[i],nums[i]-k]
            
                    temp.sort()
                    final_set.add(tuple(temp))

            # print('final_set - ',final_set)
                

        return len(final_set)


