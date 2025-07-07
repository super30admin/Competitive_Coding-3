'''
K different pairs
Leetcode 532. K-diff Pairs in an Array
https://leetcode.com/problems/k-diff-pairs-in-an-array/
'''

# Time Complexity : O(n) where n is the number of elements in the array,
# Space Complexity : O(n) in the worst case, if all elements are unique,
# Did this code successfully run on Leetcode : yes, it runs successfully.
# Any problem you faced while coding this : yes, understanding how to find unique pairs efficiently was a bit tricky at first.

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        # Brute force solution would be O(n^2) which is not efficient for large arrays
        # if k < 0:
        #     return 0
        # pairs = set()
        # for i in range(len(nums)):
        #     for j in range(i+1,len(nums)):
        #         if abs(nums[i]-nums[j]) == k:
        #             pair = tuple(sorted((nums[i], nums[j])))
        #             pairs.add(pair)
        # return len(pairs)

        # We are given an array of integers and a number k, we need to find the number of unique k-diff pairs in the array
        if k < 0:
            return 0
        if k == 0:
            # If k is 0, we need to find the number of elements that appear more than once in the array
            from collections import Counter
            count = Counter(nums)
            ''' Visualization of count:
            For nums = [3, 1, 4, 1, 5]:
            count = {3: 1, 1: 2, 4: 1, 5: 1}
            '''

            return sum(1 for v in count.values() if v > 1)
            '''
            Visualization of the sum:
            For count = {3: 1, 1: 2, 4: 1, 5: 1}:
            The only value greater than 1 is 2 (for the number 1),
            so the sum will be 1, meaning there is 1 unique pair (1, 1).
            '''
        # If k is greater than 0, we need to find the number of unique pairs
        seen = set()
        '''
        Visualization of seen set:
        For nums = [3, 1, 4, 1, 5]:
        seen = {}
        We will add elements to this set as we iterate through the nums array.
        This set will help us to check if the complement (num - k or num + k) exists in the seen set.   
        '''
        pairs = set()
        '''
        Visualization of pairs set:
        For nums = [3, 1, 4, 1, 5]:
        pairs = {}
        We will add pairs to this set as we find them.
        This set will help us to ensure that we only count unique pairs.
        The pairs will be stored as tuples (min, max) to ensure uniqueness.
        For example, if we find the pair (1, 3), we will store it as (1, 3) and not (3, 1). 
        '''
        for num in nums:
            if num - k in seen:
                pairs.add((num - k, num))
            '''
            Visualization of the above line:
            For nums = [3, 1, 4, 1, 5]:
            - When num = 3, seen = {}, no pair found.
            - When num = 1, seen = {3}, no pair found.
            - When num = 4, seen = {1, 3}, we find the pair (1, 4) because 4 - 3 = 1.
            - When num = 1, seen = {1, 3, 4}, no pair found (1 is already in seen).
            - When num = 5, seen = {1, 3, 4}, we find the pair (3, 5) because 5 - 2 = 3.
            '''
            if num + k in seen:
                pairs.add((num, num + k))
            '''
            Visualization of the above line:
            For nums = [3, 1, 4, 1, 5]:
            - When num = 3, seen = {}, no pair found.
            - When num = 1, seen = {3}, no pair found.
            - When num = 4, seen = {1, 3}, no pair found.
            - When num = 1, seen = {1, 3, 4}, no pair found (1 is already in seen).
            - When num = 5, seen = {1, 3, 4}, we find the pair (3, 5) because 5 - 2 = 3.
            '''
            seen.add(num)
        return len(pairs)

# Example usage:
if __name__ == "__main__":
    sol = Solution()
    nums = [3, 1, 4, 1, 5]
    k = 2
    result = sol.findPairs(nums, k)
    print(result)  # Output: 2 (the pairs are (1, 3) and (3, 5))
    # This will find the number of unique k-diff pairs in the array with k = 2 

# The time complexity of this solution is O(n) where n is the number of elements in the array,
# because we are iterating through the array once and using a set to store the seen elements
# and the pairs, which allows for O(1) average time complexity for lookups and insertions.
# The space complexity is also O(n) in the worst case, if all elements are unique,
# because we are storing all elements in the seen set and potentially all pairs in the pairs set.

# # Visualization of pairs:
# # For nums = [3, 1, 4, 1, 5] and k = 2:
# # Seen set will be built as follows:
# # After processing 3: seen = {3}
# # After processing 1: seen = {1, 3}
# # After processing 4: seen = {1, 3, 4}
# # After processing 1: seen = {1, 3, 4} (1 is already in seen)
# # After processing 5: seen = {1, 3, 4, 5}
# # Pairs set will be built as follows:
# # After processing 3: pairs = {}
# # After processing 1: pairs = {}
# # After processing 4: pairs = {(1, 3)}
# # After processing 1: pairs = {(1, 3)} (1 is already in pairs)
# # After processing 5: pairs = {(1, 3), (3, 5)}
# # Final pairs set = {(1, 3), (3, 5)}
# # The length of pairs set is 2, which is the final result.
