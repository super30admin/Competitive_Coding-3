# Time: O(N)
# Space: O(N)
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """

        numset = set()  # set to hold visited numbers
        resultset = set()  # set to hold results
        for num in nums:
            c1 = num - k
            c2 = num + k
            if c1 in numset:
                resultset.add(tuple(sorted([c1, num])))
            if c2 in numset:
                resultset.add(tuple(sorted([c2, num])))
            numset.add(num)
        # print(resultset)
        return len(resultset)
