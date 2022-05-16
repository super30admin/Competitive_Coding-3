'''
Approach:
1. Create a dict and a pair-dict
2. Check if (nums[i],nums[i]-k) and (nums[i],nums[i]+k) pair exist in our dictionary; as we are concerned with absolute value only
3. On the basis of availability, add the pair as a key in dictionary
4. Return count of key 

Time: 0(n) -> iterating every index
Space: 0(n) -> creating dictionary
'''

class Solution:
    
    def __init__(self):
        self.dict = {}
        self.pairDict = {}
        
    def getSolution(self,nums,k):
        
        # Iterate the nums
        for i in range(0,len(nums)):
            
            if (nums[i]-k) in self.dict:
                # Add pair to set
                
                pair = None
                if nums[i]-k < nums[i]:
                    pair = (nums[i]-k,nums[i])
                
                else:
                    pair = (nums[i],nums[i]-k)
                
                self.pairDict[pair] = 1
                
            if (nums[i]+k) in self.dict:
                # Add pair to set
                
                pair = None
                if nums[i]+k < nums[i]:
                    pair = (nums[i]+k,nums[i])
                
                else:
                    pair = (nums[i],nums[i]+k)
                
                self.pairDict[pair] = 1
                
            # Insert into dictionary    
            self.dict[nums[i]] = i  
        
        
        print('Count is:\t',len(self.pairDict))
              
        
sol = Solution()
#sol.getSolution([3,1,4,1,5], 0)
#sol.getSolution([3,1,4,1,5], 2)
#sol.getSolution([1,2,4,4,3,3,0,9,2,3],3)
#sol.getSolution([1,2,3,4,5], 1)
#sol.getSolution([-1,1], 2)
#sol.getSolution([-1,0,0,1,0,0,-1], 1)