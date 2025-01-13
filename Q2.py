########### Count K diff pairs

# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# go through and check if the element + k exists if it does add 1 and if it doesnt then continue. if k=0 then add 1 if there is atleast 2 counts of the element


from collections import Counter

def count_k_diff_pairs(nums,k):
    freq_count = Counter(nums)
    count = 0

    for key, value in freq_count.items():
        if k == 0:
            if value > 1:
                count += 1
        else:
            if (key + k) in freq_count:
                count += 1
        
    return count

