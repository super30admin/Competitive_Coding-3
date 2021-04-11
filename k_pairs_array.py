def findPairs(nums, k):
    if not nums:
        return None

    hash_map = {}
    # create a hash map with count of elements
    for i in range(len(nums)):
        if nums[i] in hash_map:
            hash_map[nums[i]] += 1
        else:
            hash_map[nums[i]] = 1

    count = 0
    # when any pair encountered with i+k increment count
    # when k == 0 and there are more than 2 of same elements in nums, increment count
    for i in hash_map:
        if k > 0 and i + k in hash_map:
            count += 1
        elif k == 0 and hash_map[i] > 1:
            count += 1

    return count


print(findPairs([3,1,4,1,5], 2))

'''
Complexity Analysis
Time complexity - O(N) - n elements in array
Space complexity - O(n) - n elements created in hash map

'''