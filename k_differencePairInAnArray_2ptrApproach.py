class Solution:
    
    def __init__(self):
        self.count = 0
        self.previousPair = None
    
    def getSolution(self,nums,k):
        
        # Sort the nums 0(nlogn)
        nums.sort()
        
        # 2-ptr Approach
        lft = 0
        rt = lft+1
        
        while rt < len(nums):
            
            if lft == rt:
                # Pairs should be unique
                rt+=1
                
            else:
                if abs(nums[lft]-nums[rt]) == k:
                    # It's a match
                    
                    # Create pair
                    pair = (nums[lft],nums[rt])
                    
                    if self.previousPair == None:
                        self.previousPair = pair
                        self.count +=1
                    
                    elif self.previousPair != None and pair != self.previousPair:
                        self.previousPair = pair
                        self.count +=1
                        
                    rt+=1
                    
                elif abs(nums[lft]-nums[rt]) > k:
                    # Move lft ptr to reduce the difference
                    lft+=1
                
                elif abs(nums[lft]-nums[rt]) < k:
                    # Move rt ptr to increase the difference
                    rt+=1 
            
            continue
        
        print('Count is:\t',self.count)

sol = Solution()
#sol.getSolution([3,1,4,1,5], 0)
#sol.getSolution([3,1,4,1,5], 2)
sol.getSolution([1,2,4,4,3,3,0,9,2,3],3)