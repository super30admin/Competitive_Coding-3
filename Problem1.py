''' 
Problem: https://leetcode.com/problems/k-diff-pairs-in-an-array/ 
Approach:  
- Use a dictionary to count occurrences of each number.
- If k is 0, count how many numbers appear more than once.
- If k is greater than 0, check if the number plus k exists in the dictionary. 
- Return the count of valid pairs.

Time Complexity: O(n)
Space Complexity: O(n)

'''

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count = defaultdict(int)
        pairs = 0
        for n in nums:
            count[n] += 1

        if k == 0:
            for n in count:
                if count[n] > 1:
                    pairs += 1
        else:
            for n in count:
                if n + k in count:
                    pairs += 1

        return pairs
