# Time Complexity : Add - O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : Yes.

# Any problem you faced while coding this : Yes, I had a little trouble coming up with edge case 
#where k == 0

'''
1. I did the problem ina similar way as 2 sum. For mod(x-y) = k, x = -k +y, OR x = k + y

2. So as I am traversing and say is currently on element y, then I am checking if k+y and -k+y exists.
If it exists we have found a pair

3. for k ==0, I am actualy storing the pairs in a hashset, and return the len of set
'''
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        if not nums and len(nums) < 1:
            return 0
        
        if k < 0:
            return 0
        
        
        hash1 = {}
        pairs = set()
        count = 0
        for i in nums:
            
            if k > 0 and i not in hash1:
                if k + i in hash1:
                    count += 1
                    
                if (-1*k)+i in hash1:
                    count += 1
                    
                hash1[i] = True
                
            elif k == 0:
                if i in hash1:
                    pairs.add((i,i))                    
                else:
                    hash1[i] = True
                    
                
                
        # print (hash1,pairs)       
        if k > 0:
            return count
        return len(pairs)
    
                
                
        