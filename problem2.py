#k diff pairs in an array
#space complexity:O(n) simce we create a hashmap to store frequencies
#time complexity: O(n) where n is the len of nums array
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if len(nums)==0:
            return False
        
        #counting occurence of each element 
        d = {}
        count=0 #putting a count for the final answer of pairs
        for i in nums:
            if i in d:
                d[i]+=1
            else:
                d[i]=1
        #two conditions to check #1 for k ==0 and one for other
        if k==0:
            for i in d.values(): #if there is more than one occurent of the same element
                if i >1:
                    count+=1
        else:
            for i in d:
                if k+i in d: #so if the  1+2=3 already exisits 
                    count+=1
        return count