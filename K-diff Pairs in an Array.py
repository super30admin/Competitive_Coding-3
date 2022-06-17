# time complexity is o(n), where n is the size of the input
# space complexity is o(n), where n is the size of the input
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        d = dict()
        count = 0
        for i in range(len(nums)):
            if(nums[i] not in d):
                d[nums[i]] = 1
            else:
                d[nums[i]] += 1
        if(k > 0):
            for i in d:
                if(i + k in d):
                    count += 1
        elif(k == 0):
            for i in d:
                if(d[i] > 1):
                    count += 1
        return count
                    
        
#         s = set()
#         fs = set()
#         d = dict()
#         for i in range(len(nums)):
#             if(nums[i] not in d):
#                 d[nums[i]] = i
#             else:
#                 d[nums[i]] = i
#         for i in range(len(nums)):
            
#             if(nums[i]-k not in s):
#                 s.add(nums[i])
#             else:
#                 if(i != d[nums[i]-k]):
#                     fs.add((min(nums[i], nums[i]-k), max(nums[i], nums[i]-k)))

#             if(nums[i]+k not in s):
#                 s.add(nums[i])
#             else:
#                 if(i != d[nums[i]+k]):
#                     fs.add((min(nums[i], nums[i]+k), max(nums[i], nums[i]+k)))
#             s.add(nums[i])
#         return len(fs)
            
        # nums.sort()
        # fs = set()
        # s = set()
        # for i in range(0,len(nums)):
        #     if(nums[i] - k not in s):
        #         s.add(nums[i])
        #     else:
        #         s.add(nums[i])
        #         if((min(nums[i],nums[i] - k ), max(nums[i],nums[i] - k )) not in fs):
        #             fs.add((min(nums[i],nums[i] - k ), max(nums[i],nums[i] - k )))
        # return len(fs)
            
            