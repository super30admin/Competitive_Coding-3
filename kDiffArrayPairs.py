#All TC passed on leetcode

class Solution:
    
    #Here we store nums and their frequency in dictionary. 
    #We then traverse the items in dictionary. If k val is 0 then we check 
    #if frequency of that num is greater than or equal to 2, we increment count by 1. 
    #If k>0 then we check if num-k in dictionary if it exists then we increment the count.
    #Time complexity - O(n)
    #Space complexity - O(n)

    def findPairs(self, nums: List[int], k: int) -> int:

        count = 0
        nums_map = collections.Counter(nums)

        for num, fq in nums_map.items():          
            if k==0:
                if fq>=2:
                    count+=1
            else:
                if num-k in nums_map:
                    count+=1
    
        return count
        