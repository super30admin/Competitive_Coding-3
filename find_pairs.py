#532. K-diff Pairs in an Array
#time= O(n)
#space = O(n)
def findPairs(nums, k):
    if k < 0:
        return 0
    
    count = 0
    freq_map = {}
    
    for num in nums:
        freq_map[num] = freq_map.get(num, 0) + 1
        
    print(freq_map)
    if k == 0:
        for key in freq_map:
            if freq_map[key] > 1:
                count += 1
    else:
        for key in freq_map:
            if key + k in freq_map:
                count += 1
    
    return count


nums = [3,1,4,1,5]
k = 2
print(findPairs(nums,k))