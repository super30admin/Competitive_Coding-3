# Time Complexity: O(numRow^2)
# Space Complexity: O(numRow^2)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []
        
        if numRows == 0:
            return result

        result.append([1])  # First row

        for i in range(1, numRows):
            row = [1]  # First element is always 1
            prev_row = result[i - 1]
            for j in range(1, i):
                row.append(prev_row[j - 1] + prev_row[j])  # Sum of two above
            row.append(1)  # Last element is always 1
            result.append(row)

        return result