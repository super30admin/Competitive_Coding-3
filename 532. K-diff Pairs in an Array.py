#532. K-diff Pairs in an Array


#Two Pointer Solution:
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        left, right = 0, 1
        output = 0
        nums.sort()
        while left<len(nums) and right<len(nums):
            
            if left==right or nums[right]-nums[left]<k:
                right+=1
            
            elif nums[right]-nums[left]>k:
                left+=1
            else:
                output+=1
                left +=1
                right+=1
   
                while left<len(nums) and nums[left]==nums[left-1]:
                    left+=1
                    
        return output

#Time Complexity: Nlog(N)
#Space Complexity: O(N) - Required for SORT


#Hashmap Solution:
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count = Counter(nums)
        output = 0
        print(count)
        for i in count:
            if k>0 and count[i+k]>0:
                output+=1
            elif k == 0 and count[i]>1:
                output+=1
        
        return output
            
#Time Complexity: O(N)
#Space Complexity: O(N) - Required for Counter

                
