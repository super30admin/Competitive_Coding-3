"""  K-diff Pairs in an Array
Time Complexity - O(n)
Space Complexity - O(n)"""

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        dict1 = {}
        for num in nums:
            if num in dict1:
                dict1[num] +=1
            else:
                dict1[num]=1
        
        result =0
        for x in dict1.keys():
            if x+k in dict1.keys() and k>=1:
                result+=1
            elif k==0 and dict1[x]>1:
                result+=1
        return result