#
# @lc app=leetcode id=532 lang=python3
#
# [532] K-diff Pairs in an Array
#

# @lc code=start
'''
Time Complexity - O(n). We are iterating the array twice.
Space Complexity = O(n). We are using a set to store the unique pairs and a hashMap to store the elements

This code works on leetcode.
'''
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        cmpMap = {} #create map
        pairs = set() #create set
        pairsCount = 0
        for i in range(len(nums)):
            cmpMap[nums[i]] = i #insert every element with index as value in the Map
        for i in range(len(nums)):
            negComplement = nums[i] - k #find the negative complement
            posComplement = nums[i] + k #find the positive complement
            if k==0 and cmpMap.get(posComplement) != i: #handling of k==0. In map we will have the last index of the number as value
                pair = (nums[i], nums[i]) 
                if pair not in pairs:  #if pair is unique insert in the resultant
                    pairs.add(pair)
                    pairsCount+=1
            if k > 0:
                if posComplement in cmpMap: #check the positive complement in map
                    pair = (nums[i], posComplement)
                    if pair not in pairs: #if pair is unique insert in the resultant
                        pairs.add(pair)
                        pairsCount+=1
                if negComplement in cmpMap: #check the negative complement in map
                    pair = (negComplement, nums[i])
                    if pair not in pairs: #if pair is unique insert in the resultant
                        pairs.add(pair)
                        pairsCount+=1
        return pairsCount 
# @lc code=end

