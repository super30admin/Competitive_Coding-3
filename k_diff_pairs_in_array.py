# Created by Aashish Adhikari at 5:27 PM 1/18/2021

'''
Time Complexity:
O(n)

Space Complexity:

In the worst case, all elements could be unique and this we could be adding all of them to hs1.
Say, 1,2,3,........n were those unique elements. -->  O(n)

Say if k == 1:
then we will be adding (1,2), (2,3), ......., (n-1,n) in hs2. --> ~ O(n)

Hence
O(n) + O(n) ~ O(n)
'''

class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """

        hs1 = set()
        hs2 = set()

        for idx in range(len(nums)):

            # 2 ways that this can happen
            # num + k
            if nums[idx] + k in hs1:

                if (nums[idx], nums[idx]+k) not in hs2:

                    hs2.add((nums[idx], nums[idx]+k))

                    # num - k
            if nums[idx]-k in hs1:

                if (nums[idx]-k, nums[idx]) not in hs2:

                    hs2.add((nums[idx]-k, nums[idx]))


            # add num to hs1
            hs1.add(nums[idx])

        return len(hs2)