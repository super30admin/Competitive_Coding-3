"""
Rasika Sasturkar
Time Complexity: O(n)
Space Complexity: O(n)
"""


def findPairs(nums, k: int) -> int:
    """
    We know that, x-y = k. So there can be two conditions:
    x = k+y, so we check x in our hashset, if present then add the pair to the
    result set and if not then add y to the hashset.
    y = x-k, same as above i.e. if y present in hashset then add the pair to
    result and if not then add x to the hashset.

    """
    # null case
    if nums is None:
        return 0

    num_set = set()
    result_set = set()
    n = len(nums)

    # x-y = k
    for i in range(n):
        temp1 = k + nums[i]
        temp2 = nums[i] - k

        if temp1 in num_set:
            res = sorted([nums[i], temp1])
            res = tuple(res)
            result_set.add(res)
        if temp2 in num_set:
            res = sorted([nums[i], temp2])
            res = tuple(res)
            result_set.add(res)
        num_set.add(nums[i])
    return len(result_set)


def main():
    """
    Main function - an example from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all test cases.
    """
    print(findPairs(nums=[3, 1, 4, 1, 5], k=2))  # returns 2
    print(findPairs(nums=[1, 2, 3, 4, 5], k=1))  # returns 4
    print(findPairs(nums=[1, 3, 1, 5, 4], k=0))  # returns 1


if __name__ == "__main__":
    main()
