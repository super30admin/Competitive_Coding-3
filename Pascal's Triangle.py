class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        #TimeComplexity: O(numRows^2)
        #SpaceComplexity: O(1)
        
        triangle = []
        
        for i in range(numRows):
            row = []
            for j in range(i+1):
                if j == 0 or j == i:
                    item = 1
                else:
                    prev = triangle[i-1]
                    item = prev[j-1] + prev[j]
                row.append(item)
            triangle.append(row)
            
        return triangle