class Solution:
    """
    ------------------------------------------------------------
    K-diff Pairs in an Array
    ------------------------------------------------------------
    Given:
      - nums[] : array of integers
      - k      : integer (non-negative difference value)
    
    Goal:
      Count the number of UNIQUE k-diff pairs (nums[i], nums[j]) where:
          - i ≠ j (different indices)
          - |nums[i] - nums[j]| == k (absolute difference equals k)
          - Pairs are unique by VALUES, not indices
          - (1, 3) and (3, 1) are considered the SAME pair
    
    Key Insights:
      1. k = 0 Special Case:
         - We need pairs where nums[i] == nums[j] with i ≠ j
         - This means the value must appear AT LEAST TWICE
         - Each duplicate value forms exactly ONE unique pair
         - Example: [1,1,1] with k=0 → only 1 pair: (1,1)
      
      2. k > 0 Case:
         - For each unique value x, check if (x + k) exists
         - No need to check (x - k) separately due to iteration
         - Example: nums=[1,3], k=2 → when we check 1, we find 3
         - Duplicates don't matter: [1,1,3,3] still just 1 pair
      
      3. Why Counter Works:
         - Reduces problem to unique values + frequencies
         - Eliminates index management complexity
         - Natural separation of k=0 vs k>0 logic
    
    Examples Walkthrough:
      
      Example 1: nums = [3,1,4,1,5], k = 2
      - Counter: {3:1, 1:2, 4:1, 5:1}
      - k > 0, so check each unique value:
        - 3+2=5 ✓ exists → count=1
        - 1+2=3 ✓ exists → count=2
        - 4+2=6 ✗ 
        - 5+2=7 ✗
      - Result: 2 pairs (1,3) and (3,5)
      
      Example 2: nums = [1,3,1,5,4], k = 0
      - Counter: {1:2, 3:1, 5:1, 4:1}
      - k = 0, so count values with freq ≥ 2:
        - 1 appears 2 times ✓ → count=1
      - Result: 1 pair (1,1)
    
    Approaches:
      1. Brute Force (Check all pairs) – O(n²)
      2. Sort + Two Pointers – O(n log n)
      3. Hash Map + Set for uniqueness – O(n)
      4. Counter (Frequency Map) – O(n) ✔ Optimal & Cleanest
    
    ------------------------------------------------------------
    Algorithm (Counter Approach):
      
      Step 1: Count frequency of each unique value
      Step 2: If k = 0:
                Count how many values appear ≥ 2 times
              If k > 0:
                For each unique value, check if (value + k) exists
      Step 3: Return count
    
    Why This is Better:
      - No index management needed
      - Clear separation of edge cases
      - Only iterates unique values (not all elements)
      - More intuitive and readable
    
    Time Complexity: O(n)
      - Building Counter: O(n)
      - Iterating unique values: O(u) where u = unique count ≤ n
      - Counter membership check: O(1) average
      - Total: O(n)
    
    Space Complexity: O(n)
      - Counter storage: O(u) where u ≤ n unique values
      - Worst case all elements unique: O(n)
    ------------------------------------------------------------
    """
    
    def findPairs(self, nums: List[int], k: int) -> int:
        # Edge case: negative k is mathematically invalid
        # (absolute value cannot be negative)
        if k < 0:
            return 0
        
        # Count frequency of each number in the array
        # This reduces the problem to unique values + their counts
        counter = Counter(nums)
        count = 0
        
        if k == 0:
            # Special case: k=0 means we need identical pairs
            # A number can form a pair with itself only if it appears ≥ 2 times
            # Each such number contributes exactly ONE unique pair
            for num, freq in counter.items():
                if freq >= 2:
                    count += 1
        else:
            # General case: k>0 means we need distinct values
            # For each unique number x, check if (x + k) exists
            # 
            # Why only check forward (x + k) and not backward (x - k)?
            # - We iterate through ALL unique values
            # - For pair (a, b) where b = a + k:
            #   → We find it when iterating at x=a (checking a+k)
            #   → No need to find it again at x=b (checking b-k)
            #   → Checking both directions would double count!
            for num in counter:
                if num + k in counter:
                    count += 1
        
        return count
    
    # Time Complexity: O(n) - counting + iterating unique values
    # Space Complexity: O(n) - counter storage