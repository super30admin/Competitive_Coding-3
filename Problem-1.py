# Time Complexity :O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this : a little near creating hashset logic


# Your code here along with comments explaining your approach
# Use a HashSet (prev_visited_elem) to track numbers seen so far so you can instantly check if a matching pair exists.
# For each number, compute x = num - k and y = num + k and check if either value was seen before — if yes, that forms a valid k-diff pair.
# Store each pair in a set (output) to avoid duplicates, and return the number of unique pairs found.

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k < 0:
            return 0
        prev_visited_elem = set()
        output = set()
        for num in nums:
            x = num - k
            y = num + k
            if x in prev_visited_elem:
                output.add((x, num))
            if y in prev_visited_elem:
                output.add((num, y))
            prev_visited_elem.add(num)
        return len(output)
