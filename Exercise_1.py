# 532. K-diff Pairs in an Array
# Time Complexity: O(n)
# Space Complexity: O(n)



class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """

        hash_table = {}
        for i in range(len(nums)):
            count = 1
            if nums[i] in hash_table:
                hash_table[nums[i]] = count+1
            else:
                 hash_table[nums[i]] = count
                    
        print(hash_table)
        ret_count = 0
        for i in hash_table:
            lookup = i + k
            if lookup in hash_table and k !=0 :
                ret_count +=1
            
            if k == 0 and hash_table[lookup]>1:
 
                ret_count +=1
        return ret_count
