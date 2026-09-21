'''
532 K-diff pairs in an array
https://leetcode.com/problems/k-diff-pairs-in-an-array/description/

Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

    0 <= i, j < nums.length
    i != j
    |nums[i] - nums[j]| == k

Notice that |val| denotes the absolute value of val.

Example 1:
Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

Example 2:
Input: nums = [1,2,3,4,5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

Example 3:
Input: nums = [1,3,1,5,4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).

Solution:
1. Brute Force:
Time: O(N^2), Space: O(1)

2. Sort and Two-pointer w/ Prefix sum:
Time: O(N log N + N) = O(N log N), Space: O(1)

3. Hashing:
Step 0: In a hash map, keep frequency count of all elements in the array.
Step 1: Then for each key in the hash map, we have two cases:
    a) If k = 0 (target sum), then if freq count >= 2, then we have discovered a pair. Eg. A = [1,1,3,3,3,2], k = 0 -> hash = {1:2,3:3,2:1} -> pairs = (1,1), (3,3)

    b) If k != 0, then if key + k exist in map, then we have discovered a pair
    Eg. A = [1,1,3,3,3,2], k = 1 -> hash = {1:2,3:3,2:1} -> pairs = (1,2), (2,3)

    Why check only a+k in the map but not a-k?
    if |a-b| = k, then either:
    if a>=b, then b = a - k, pair = (b,a) = (a-k, a)
    if a<b,  then b = a + k, pair = (a,b) = (a, a+k)
    However, in the map, we check only a+k since the
    pairs (a-k, a) and (a, a+k) would form identical pairs.
    Let a = 1, b = 2, k = 1, then pair = (a, a+k) = (1,2)
        a = 2, b = 1, k = 1, then pair = (a-k, a) = (1,2)

    Eg. A = [1,1,3,3,3,2], k = 1.
    Try checking both a+k, a-k
    for a in hash.keys():
        a = 1 -> check if b=a+k=2 exists in hash -> Yes, pair = (1,2)
              -> check if b=a-k=0 exists in hash -> No

        a = 3 -> check if b=a+k=4 exists in hash -> No
              -> check if b=a-k=2 exists in hash -> Yes, pair = (2,3)

        a = 2 -> check if b=a+k=3 exists in hash -> Yes, pairs = (2,3)
              -> check if b=a-k=1 exists in hash -> Yes, pairs = (2,1)
    Thus, if we remove either the 'a-k' or 'a+k' checks, we get all unique pairs.

Time: O(N), Space: O(N)
'''

def k_diff_pairs_return_count(nums, k):
    N = len(nums)
    if N <= 1: # cannot have pairs w/ 0 or 1 len arrays
        return 0

    h = set()
    result = set()
    for num in nums:
        tgt1, tgt2 = num - k, num + k

        if tgt1 in h:
            result.add(tuple(sorted([num, tgt1])))

        if tgt2 in h:
            result.add(tuple(sorted([num, tgt2])))

        h.add(num)
    return len(result), result

def run_tests():
    tests = [([1,1,3,3,3,2],0,2),
             ([1,1,3,3,3,2],1,2),
             ([1,1,3,3,3,2],2,1),
             ([3,1,4,1,5], 2, 2),
             ([1,2,3,4,5],1,4),
             ([1,3,1,5,4],0,1),
    ]
    for test in tests:
        nums, k, ans = test[0], test[1], test[2]
        count, pairs = k_diff_pairs_return_count(nums, k)
        print(f"\nnums = {nums}")
        print(f"Target sum = {k}")
        print(f"Number of unique pairs that sum to {k} = {count}")
        print(f"Pairs = {pairs}")
        passed = (ans == count)
        assert passed == True, f"Test case failed"
        print(f"Pass: {passed}")

run_tests()
