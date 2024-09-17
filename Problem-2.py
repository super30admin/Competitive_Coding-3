"""
zYou are given an integer array and a value k, you have to search for the unique k different pairs in this array .

we define k different pairs as an integer pair (i,j), where i and j are the numbers in the given array only whose absolute difference is k.

Keep in mind that the pairs (i,j) and (j,i) are conted as same pair and the length of the array will not exceed 10,000. also all the integer values belong to the range [-1e7,1e7]





Example 1:
Input:[1, 2, 3, 4, 5], k = 1

Output: 4

Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

Example 2:
Input: [1, 3, 1, 5, 4, 8], k = 0

Output: 1

Explanation: There is one 0-diff pair in the array, (1, 1).

TIME- O(N)
SPACE=O(N)
LEETCODE - YES

"""
from collections import Counter
def Pair(nums,k):
    count=0
    # dict={}
    dic =Counter(nums)   # create hashmap
    print(dic)
    # for i in range(len(nums)):
    #     if nums[i] not in dict:
    #         dict[nums[i]] = i
    #     else:
    #         dict[nums[i]] = i
    # print(dict)
    for num in dic:   # check numbers in hashmap
        if (k > 0 and num+k in dic) or (k==0 and dic[num]>1):  # if k > 0 then look for num+k in dic or if k =0 look tht we have the number with more than 1 count
            count += 1
    return count

print(Pair([1, 3, 1, 5, 4, 8], k = 0))
