class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if (len(nums)==0 or nums ==None):
            return 0
        count= 0
        nums.sort()
        leftPointer =0
        rightPointer = 1
        size =len(nums)
        while(rightPointer<size):
            diff = ( nums[rightPointer] - nums[leftPointer])
            
            if diff == k:
             
                count+=1
                    
                rightPointer+=1
                leftPointer+=1
               
                
            elif diff > k:
                leftPointer+=1
            else:
                
                rightPointer+=1
            while  leftPointer< size-1 and nums[leftPointer] == nums[leftPointer-1]:
                    leftPointer += 1
                    
            while rightPointer < size-1 and nums[rightPointer] == nums[rightPointer-1]:
                    rightPointer += 1
                    
            if rightPointer <=leftPointer:
                rightPointer = leftPointer+ (leftPointer - rightPointer) + 1
                
        
        return count
