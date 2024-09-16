# Time : ~ O(N)
# Space : O(N)

def kDiffPairs(nums, k):

    hashmap = {} # in order to avoid duplicate pairs count
    pairs = 0

    # O(N) operation
    for idx, val in enumerate(nums):
        if val in hashmap:
            hashmap[val] += 1

        else:
            hashmap[val] = 1

    # O(N) operation
    for key, val in hashmap.items():
        if k != 0:
            if key + k in hashmap:
                pairs += 1

        else:
            # if dfference k = 0, there should be more than one occurrence of that number inorder to count as a pair
            if val > 1:
                pairs += 1

    return pairs 
