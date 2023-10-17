class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        """
        Time Complexity: O(n)
        Space Complexity: O(n)
        Did this code successfully run on Leetcode: Yes 

        Any problem you faced while coding this: Couldn't think of edge cases
        Your code here along with comments explaining your approach:
        The approach:
            - we traverse the list
                - we check whether k is 0 or not 
                - if it's not zero, we check whether the element is in pair or not
                    -if element not in pair
                        - we check if element - k in pair
                            if yes, we increase the counter by 1
                        - we check if element + k in pair
                            if yes, we increase the counter by 1
                - if it's zero
                    - we check whether the element - k in pair and also it should have 
                    appeard only once.
                        -if the condition is met, we increase the counter by 1 
                - After that we check if the element is already in the pair 
                    we increase the value by 1
                - else we set the value to 0 
            - In the end, we return the count
        """
        n = len(nums)
        count = 0
        pair = dict()
        for i in range(0, n):
            if k != 0:
                if nums[i] not in pair:
                    if nums[i] - k in pair:
                        count += 1
                    if nums[i] + k in pair:
                        count += 1
            else:
                if nums[i] - k in pair and pair[nums[i] - k] < 1:
                    count += 1
            if nums[i] in pair:
                pair[nums[i]] += 1                
            else:
                pair[nums[i]] = 0
        return count