# Iterative:
# Time: O(N^2)
# Space: O(N^2)

class Solution:
    def generate(self, numRows):
        if numRows <= 0: return []

        results = []
        for i in range(numRows):
            if i + 1 == 1:
                results.append([1])
            elif i + 1 == 2:
                results.append([1, 1])
            else:
                last_result = results[-1]
                result = [1]
                for r in range(0, len(last_result) - 1):
                    pascal = last_result[r] + last_result[r + 1]
                    result.append(pascal)
                result.append(1)
                results.append(result)
        return results
