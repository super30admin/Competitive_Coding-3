#TC: O(n)
#SC: O(n)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        pairs_set=set()
        nums_set=set()
        for i,num in enumerate(nums):
            if num+k in nums_set: pairs_set.add((num,num+k))
            if num-k in nums_set: pairs_set.add((num-k,num))
            nums_set.add(num)
        self.findPairs2(nums,k)
        return len(pairs_set)

    def findPairs2(self, nums, k):
        result = 0

        counter = Counter(nums)

        for x in counter:
            if k > 0 and x + k in counter:
                result += 1
            elif k == 0 and counter[x] > 1:
                result += 1
        return result