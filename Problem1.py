class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k < 0: # A negative difference is not possible
            return 0
        seen = set() # To store unique numbers
        pairs = set() # To store unique k-diff pairs

        for num in nums:
            # Check for a valid k-diff pair (num + k) and (num - k)
            if k > 0: # For positive k, check both directions
                if num + k in seen:
                    pairs.add((num, num + k))
                if num - k in seen:
                    pairs.add((num - k, num))
            else: # For k = 0, we only care about duplicates
                if num in seen:
                    pairs.add((num, num))
            seen.add(num)  # Add the current number to the seen set
        return len(pairs)
        # T: O(n), S: O(n)