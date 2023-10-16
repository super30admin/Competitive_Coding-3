# TC : O(numRows^2)
# SC : O(1)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[1], [1,1]] # 
        if numRows == 1: return [result[numRows-1]]
        elif numRows == 2: return result
        else:
            for n_level in range(3, numRows + 1):
                dummy_arr = [1] * n_level

                for i in range(1, n_level-1):
                    dummy_arr[i] = result[n_level-2][i-1] + result[n_level-2][i]
                result.append(dummy_arr)
            return result

