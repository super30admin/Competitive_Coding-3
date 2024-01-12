# Problem: K-diff Pairs in an Array
# time complexity: O(n)
# space complexity: O(n)
# edge case: k < 0
#approach: two sets
# 1. create a set to store all the numbers in nums
# 2. create another set to store all the pairs
# 3. iterate through nums
# 4. if k == 0, check if the number is in the set, if so, add (num, num) to the pair set
# 5. if k != 0, check if num - k or num + k is in the set, if so, add (num - k, num) or (num, num + k) to the pair set
# 6. add num to the set
# 7. return the length of the pair set
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k < 0:
            return 0

        num_set = set()
        pair_set = set()

        for num in nums:
            if k == 0:
                if num in num_set:
                    pair_set.add((num, num))
            else:
                if num - k in num_set:
                    pair_set.add((num - k, num))
                if num + k in num_set:
                    pair_set.add((num, num + k))

            num_set.add(num)

        return len(pair_set)