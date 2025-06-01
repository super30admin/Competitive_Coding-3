"""
Use frequency map of all elements using Counter.
If k = 0, count how many elements occur more than once.
If k > 0, for each unique nums[i], check if nums[i] + k exists in map and keep adding count of those pairs
"""
"""
Time Complexity: O(n), n is the length of nums
Space Complexity: O(n) for the Counter
"""

from collections import Counter
class diffKpairs:
    def findPairs(self,nums,k):
        if k < 0:
            return 0
        count = 0
        freq = Counter(nums)
        if k == 0:
            count = sum(1 for val in freq.values() if val > 1)
        else:
            count = sum(1 for num in freq if num + k in freq)
        return count
    
if __name__=="__main__":
    obj = diffKpairs()
    nums = [1,2,3,4,5]
    k = 1
    print(obj.findPairs(nums,k))
