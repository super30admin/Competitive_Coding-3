class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        # TC : O(n)
        # SC : O(n)
        seen = set()    # Initialize a set to keep track of seen numbers
        pairs = set()   # Initialize a set to store unique pairs

        
        for n in nums:
            pair1 = n + k  
            pair2 = n - k   

            # Check if | val| has been seen and 
            # if the pair (n, pair1) is not already counted
            if pair1 in seen and (pair1, n) not in seen:
                pairs.add((n, pair1))

            # Check if |-val| has been seen and 
            # if the pair (n, pair2) is not already counted
            if pair2 in seen and (pair2, n) not in seen:
                pairs.add((pair2, n))

            # Add the current number to the seen set for future pair checks
            seen.add(n)
        
        # Return the number of unique pairs found
        return len(pairs) 
            