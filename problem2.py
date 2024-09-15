TC:O(n)
SC:O(n)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if nums is None or k < 0:
            return 0

        hmap = {}

        for index,num in enumerate(nums):
            hmap[num] = index

        result = set()
        for index,num in enumerate(nums):
            number1 = num + k
            number2 = num - k

            if number1 in hmap and hmap[number1] != index:
                li = [number1,num]
                li.sort()
                tu = tuple(li)
                if tu not in result:
                    result.add(tu)

        return len(result)






