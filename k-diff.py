#time complexity - O(n)
#space complexity - O(n)
#Did this code successfully run on Leetcode : yes
#Your code here along with comments explaining your approach
# create two sets one for visited elements and the other for keeping track of
# k-diff pairs found and add into them if already not added
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        d = set() #pairs
        t = set() #checked elements 
        for i,j in enumerate(nums):
            if j + k in t and i != nums.index(j+k):
                if (j,j+k) not in d and (j+k,j) not in d:
                    d.add((j,j+k))
            if j - k in t and i != nums.index(j-k):
                if ((j,j-k)) not in d and ((j-k,j)) not in d:
                    d.add((j,j-k))
            
            t.add(j)
        return len(d)
