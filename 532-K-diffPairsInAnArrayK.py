class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        result = 0
        counter = Counter(nums)
        # print(counter)
        for i in counter:
            if k > 0 and i+k in counter:
                result += 1
            elif k == 0 and counter[i] > 1:
                result  +=1
        return result 

    # space: o(n)
    # time: o(n)