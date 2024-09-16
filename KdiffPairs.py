# Brute force. fix an element and traverse rest. Make sure duplicate pairs are not considered by shipping repeat elements in both loops - you are good. TC = O(n2), SC = O(n) 
def kdiff(nums, k):
    sort_= sorted(nums)
    count = 0
    for i in range(len(sort_)):
        if i > 0 and sort_[i] == sort_[i-1]:
            continue
        for j in range(i+1, len(sort_)):
            if j > i+1 and sort_[j] == sort_[j-1]:
                continue
            if sort_[j]-sort_[i] == k:
                count += 1
    return count

nums = [1,2,4,4,3,3,0,9,2,3]
k = 3
print(kdiff(nums, k))

# Improvement over previous: Using two pointers we can avoid inner loop. all elements considered in single loop. TC = O(nlogn) sorting SC = O(n)
# Fix left pointer at 0 index and right at 1.
# if diff < k: increment right (widen gap)
# if diff > k increment left (shrink gap)
# if diff == k increment left, count += 1 & move left pointer until not equal to previously considered element. ***If left lands at same place as right- increment right ***

def kdiff2(nums, k):
    sort_ = sorted(nums)
    l, r = 0, 1
    count = 0
    while l < len(sort_) or r < len(sort_):
        kdiff = sort_[r] - sort_[l]
        if l ==r or kdiff < k:
            r+= 1
        elif kdiff > k:
            l+=1
        else:
            count += 1
            l+=1
            while l< len(sort_)-1 and sort_[l] == sort_[l-1]:
                continue
    return count

# Improvement: sorting can be avoided by using hashmap to store count of elements in the array. traverse through hashmap. for each element, if there exists element + k in the dictionary - pair found! 
# Edge cases handled- 1)for k = 0, repeated ellements are considered as 1 pair 2) avoid duplicate pairs each time- we look for element + k, so we avoid!
# TC = O(n), SC = O(1)
from collections import Counter
def kdiff3(nums, k): 
    map = Counter(nums)
    count = 0
    for x in map:
        if k > 0 and x+k in map:
            count += 1
        if k == 0 and map[x] > 1:
            count +=1
    return count

nums = [1,2,4,4,3,3,0,9,2,3]
k = 3
print(kdiff3(nums, k))
