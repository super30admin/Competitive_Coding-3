#https://leetcode.com/problems/k-diff-pairs-in-an-array/submissions/
#TC : O(n)
#SC : O(n)
#solved on leetcode: yes

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hashMap = collections.defaultdict(int)
        counter = 0

        #creating hashMap
        for num in nums:
            hashMap[num] += 1
        
        for key in hashMap:
            val = key + k

            if val in hashMap:
                if (k == 0):
                    if hashMap[val] > 1:
                        counter += 1
                    else:
                        continue
                else:
                    counter += 1

        return counter