# Did this code successfully run on Leetcode : YES

# approach
# result = empty list
# if n == 1: simply append [1] to result
# for n > 1 -> we know two fixed elements (first and last are 1s)
# start with temp = [1]
# get last element from result
# run loop and get sum of every 2 elements in sequence
# at the last append another 1 to temp

# TC: O(n^2)
# SC: O(1) -> contradicts with Leetcode SC

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = []
        res.append([1])
        for n in range(2, numRows+1):
            # if n == 1:
            #     res.append([1])
            # else:
            temp = [1]
            # x = res[-1] # [1, 3, 3, 1]
            for i in range(1, len(res[-1])):
                temp.append(res[-1][i]+res[-1][i-1])
            temp.append(1)
            res.append(temp)
                # [1, 4, 6, 4, 1]
        return res