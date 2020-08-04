# Time Complexity : O(n) where n is the number of elements in the list
# Space Complexity : O(m) where m is the number of unique elements in the list
# Did this code successfully run on LeetCode :  yes
# Any problem you faced while coding this : no



class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:

    #when target is negative, we wil return 0
        if k < 0:
            return 0

        hashMap = {}
        output = 0

    #we iterate through the list and keep track of the frequency of numbers
        for num in nums:

            if num in hashMap:

                hashMap[num] += 1
            else:

                hashMap[num] = 1

        if k == 0:

        #If target is zero we will return number of items that have frequecy greater than 1
            for key, value in hashMap.items():

                if value > 1:

                    output += 1

            return output

        else:

        #else we will return the number of (element + k) present in the hashmap
            for key in hashMap:

                if key + k in hashMap:

                    output += 1

            return output

