# 532. K-diff Pairs in an Array
# // Time Complexity :O(2n) = O(n)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach
def findPairs(nums, k):
    # using hashset for unique pairs
    hash_set = set()
    # using hashmap for frequency of all elements
    hash_map = {}

    # iterating over the array
    for i in range(len(nums)):
        # if element is present in hashmap increase its count
        if nums[i] in hash_map:
            hash_map[nums[i]] += 1
        else:
            # if not present in hashmap, add it with 1 count
            hash_map[nums[i]] = 1

    # iterating over the hashmap keys
    for num in hash_map.keys():
        # if target is 0, we find duplicate elements
        if k == 0 and hash_map[num] > 1:
            # add tuple to the set
            hash_set.add((num, num))
        # if target is > 0, we find element and its complement
        elif k > 0 and (num + k) in hash_map:
            # add tuple to the set
            hash_set.add((num, num+k))
    return hash_set


nums = [3, 1, 4, 1, 5]
k = 2
print(findPairs(nums, k))
