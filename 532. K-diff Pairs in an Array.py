# T complexity - O(nlogn) // Sort array and then traversal on array
# S Complexity - O(1)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:

        nums.sort()

        left = 0

        right = 1

        counter = 0

        if (len(nums) < 1):
            return 0
        
        while(right < len(nums)):

            difference = abs(nums[left] - nums[right])

            if difference == k:
                counter +=1
                left +=1
                right +=1
                
                # to skip duplicates if we encounter any on the right
                while(right < len(nums) and nums[right-1] == nums[right]):
                    right +=1

            ## if our difference is less than k, shift right pointer
            elif difference < k:
                right +=1
            
            ## else move our right pointer in case difference bigger than k
            else:
                left += 1

                # we could have a siutation where left becomes bigger than right
                # simply update right to be bigger than left +1
                if right <= left:
                    right +=1
            

        
        return counter




        
