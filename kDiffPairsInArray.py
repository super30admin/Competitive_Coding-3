# TC - O(n)
# SC - O(n)
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        # storing k-different pairs in result variable and initilizing it to 0
        result = 0
        #creating a hashMap where keys are array elements and the value are the count of the array element
        map = Counter(nums)
        
        #iterating over the map
        for i in map:
            # case 1 k>0  and i+k is present in our hash map then we have found a pair and therefore incresse result
            if k>0 and i+k in map:
                result = result +1
            #case 2 k == 0 this means the pair will have same number we can find this where the map value is greater than 1
            elif k == 0 and map[i]>1:
                result = result +1
        return result
        