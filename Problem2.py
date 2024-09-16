class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        cnt = 0
        if len(nums) <=1 or k < 0:
            return cnt
        nums.sort()
        i = 0  
        j = 1  
        done = False
        while not done:
            if i == j:   
                if j < len(nums)-1:
                    j += 1
                else:    
                    break
            if abs(nums[i]-nums[j]) == k:
                cnt += 1
                tmp = nums[j]
                if j < len(nums)-1:   
                    while j < len(nums)-1 and nums[j] == tmp:
                        j += 1
                    if nums[j] == tmp:   
                        break
                else:
                    done = True
            elif abs(nums[i]-nums[j]) < k:   
                if j < len(nums) -1:
                    j+= 1
                else:   
                    done = True
            elif abs(nums[i]-nums[j]) > k:    
                if i < j and i < len(nums) -1:   
                    i += 1
                else:
                    done = True   
        return cnt