class Solution:
    def generate(self, numRows):
        if numRows is None or numRows <= 0:
            return []

        res = []

        for i in range(0, numRows):
            li = list()
            for j in range(0, i + 1):
                if j == 0 or j == i:
                    li.append(1)
                    # print(li, res)
                else:
                    # print(i- 1, "i", j - 1, 'j')
                    # print(res)
                    left = res[i - 1][j - 1]
                    right = res[i - 1][j]
                    li.append(left + right)
            res.append(li)

        return print(res)

if __name__ == "__main__":
    obj = Solution()
    obj.generate(7)


# TC = O(n). we are traversing the numRows times.
# Space complexity : O(n). Constant. extra space used a list created
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No
