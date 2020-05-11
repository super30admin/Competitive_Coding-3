#TC-O(nlogn)+O(n)=O(nlog n )
#SC-O(1)
#Ran successfully on leetcode:Yes
#Two pointer approach-Fix left pointer, righ tpointer would the next element. Here we check id the difference is greater or lesser or equal to the target and likewise increment the pointers.A count variable is incremented whenever the difference is equal to the target. 


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if not nums or len(nums)<2 :
            return 0
        nums.sort()
        count=0
        r=0
        
            
        for i in range(len(nums)):
             if i>0 and nums[i]==nums[i-1]:
                    continue
             # l=i
             r=max(r,i+1)
             while(r<len(nums)):
                if (nums[r]-k==nums[i]):
                    count+=1
                    break

                elif (nums[r]-k<nums[i]):
                    r+=1
                else:
                    break
                # l=i+1
                # r-=1
        return count

# Alternative approach:
#TC-O(n)
#SC-O(n)
#Ran successfully on leetcode Yes
from collections import Counter
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
		#If k is less than 0, then the result is 0 since we are looking fpr pairs with an ABSOLUTE difference of k.
        if k < 0:
            return 0
        
        count = Counter(nums)
        pairs = set([])
        
        for num in count.keys():
			#Special case: If k == 0, then there needs to be at least two occurences of a particular num in nums 
			#in order for there to be a pair (num, num).
            if k == 0:
                if count[num] > 1:
                    pairs.add((num, num))
					
			#Regular case: k != 0. Simply check if num + k is a member of the array nums.
			#Insert the pair into the set of pairs (smallerNum, largerNum) so that there are no duplicate pairs.
            else:
                otherNum = num + k
                if otherNum in count:
                    pairs.add((num, otherNum) if num <= otherNum else (otherNum, num))
                    
        return len(pairs)
