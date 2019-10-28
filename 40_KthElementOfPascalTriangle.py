# calculating pascal's row based on line condition and calculating inline pascal's kth line.
# time - O(N), where the N is the given input k, so we will iterate k number of times.
# space - O(N), output array.
class Solution:
    def getPascalRow(self, k):
        line = [1] # if k is 0 return 1.

        for i in range(1, k + 1): # iterate till k elements
            line.append(int(line[i - 1] * (k + 1 - i) / i))
        return line

sol = Solution()
print(sol.getPascalRow(2))