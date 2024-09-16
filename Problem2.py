# Time complexity: O(n)
# Space complexity: O(n)
# Works on leetcode: yes
# Approach: We save the frequency of the integers in a dictionary and iterate through it. Now we have 2 cases - 1. If k=0,
# then we check if the freq of integer is more than 1, add it to count 2. Check if integer+k is in the dictionary to add it 
# to count.
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if not nums or k<0:
            return 0
        mapping = collections.Counter(nums)
        count = 0
        for key,val in mapping.items():
            if k==0:
                if val>1 :
                    count +=1 
                    
            elif (key+k) in mapping:
                    count +=1 
        return count 
        