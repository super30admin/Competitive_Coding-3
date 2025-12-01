class Solution:
    """
    ------------------------------------------------------------
    Pascal's Triangle
    ------------------------------------------------------------
    Given:
      - numRows : integer representing number of rows to generate
    
    Goal:
      Return the first numRows of Pascal's triangle as a 2D list.
      
      Pascal's Triangle Properties:
          - First and last element of each row is 1
          - Each interior element is the sum of two elements above it
          - Row i has (i+1) elements
          
      Example:
          Row 0:           1
          Row 1:         1   1
          Row 2:       1   2   1
          Row 3:     1   3   3   1
          Row 4:   1   4   6   4   1
    
    Approaches:
      1. Brute Force (Recalculate each element) – O(n^3)
      2. Dynamic Programming (Build row by row) – O(n^2) ✔ Optimal
           - Space: O(n^2) for output, O(1) auxiliary space
      3. Combinatorial Formula (nCr) – O(n^2) with O(n) per element
    
    ------------------------------------------------------------
    Algorithm (Dynamic Programming):
      1. Initialize triangle with all 1s (correct for first/last elements)
      2. For each row i starting from row 2:
           For each position j from 1 to i-1:
               dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
      3. Return the complete triangle
    
    Time Complexity: O(n^2)
      - We have n rows
      - Row i has i elements to potentially compute
      - Total: 1 + 2 + 3 + ... + n = n(n+1)/2 = O(n^2)
    
    Space Complexity: O(n^2)
      - Output requires O(n^2) space
      - Auxiliary space: O(1) (only loop variables)
    ------------------------------------------------------------
    """
    
    def generate(self, numRows: int) -> List[List[int]]:
        # Initialize triangle with all 1s
        # Row i has (i+1) elements
        dp = [[1 for _ in range(i + 1)] for i in range(numRows)]
        
        # Fill interior elements starting from row 2 (index 2)
        for i in range(2, numRows):
            # Only update interior elements (skip first and last)
            for j in range(1, i):
                # Each element is sum of two elements from row above
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
        
        return dp