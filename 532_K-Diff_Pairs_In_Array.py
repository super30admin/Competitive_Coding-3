# Leetcode problem link : https://leetcode.com/problems/k-diff-pairs-in-an-array/
# Time Complexity : O(n)
#  Space Complexity : O(n)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
'''
        Basic approach : O(n^2) => Start from each index and look for a sorted pair and keep adding in a hashset response variable to make sure the pair is unique.
        Second brute force approach is by sorting the array and then looking for unique pairs and incrementing the counter .If the element is same as previous one then skip the next element only if k is not zero

        Optimized approach: O( n^2 ) => 1. Create a hash map to store elements and their index.
        2. Traverse the array and compute positive and negative complement for each element. Positive is adding k to element and negative is deducting k from element.
        3. If complement is present in the hashmap then we have found the k-diff pair, add the sorted tuple to hashset to make sure its not repeated in reverse.
        4. In case when k is zero then we check for the index of element encountered, if index is differnt then its a unique pair of same element present at different index.
        5. Add the current element to the hashmap
        6. Return the size of hasset at the end
        
'''
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        # edge case
        if not nums or len(nums) == 0 or k < 0:
            return 0
        # 1 declare hashmap and hashset
        map_nums = {}
        unique_pair = set()
        
        # 2
        for i in range(len(nums)):
            #2
            neg_comp = nums[i] - k;
            pos_comp = nums[i] + k;
            # adding to hashset
            # 3
            if k != 0:
                if(neg_comp in map_nums):
                    unique_pair.add(tuple(sorted([nums[i],neg_comp])))
                if(pos_comp in map_nums):
                    unique_pair.add(tuple(sorted([nums[i],pos_comp])))
            # adding nums[i] to hashmap
            # 4
            if nums[i] in map_nums:
                if k == 0 and map_nums[nums[i]] != i:
                    temp = (nums[i], nums[i])
                    unique_pair.add(temp)
            # 5
            else:
                map_nums[nums[i]] = i
        # 6
        return len(unique_pair)