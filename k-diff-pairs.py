class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        s = sorted(nums)
        count = 0
        # for j in range(len(s)):
        #     if j>0 and s[j]==s[j-1]:
        #         continue
        #     for i in range(j+1,len(s)):
        #         if i>j+1 and s[i]==s[i-1]:
        #             continue
        #         # print(abs(s[j]-s[i+1]))
        #         if k==abs(s[j]-s[i]):
        #             count+=1
        #     # print(count)
        # return count
        # time-O(n**2) space-O(n)

        # left=0
        # right=1
        # while left<len(s) and right<len(s):
        #     if left==right or s[right]-s[left]<k:
        #         right+=1
        #     elif s[right]-s[left]>k:
        #         left+=1
        #     else:
        #         left+=1
        #         count+=1
        #         while left<len(s) and s[left]==s[left-1]:
        #             left+=1
        # return count
        # time-o(nlogn) space-o(n)
        dic = {}
        for i in nums:
            if i not in dic:
                dic[i] = 1
            else:
                dic[i] += 1
        # print(dic)
        for x in dic:
            if k > 0 and k + x in dic:
                count += 1
            elif k == 0 and dic[x] > 1:
                count += 1
        return count
    # time-O(n) space-O(n)