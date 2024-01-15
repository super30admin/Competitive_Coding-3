""" Explanation: In order to solve this optimally, I used a hashmap where the number in the array is the key and the value is the frequency 
    of that element. Then, we simply go through the map to see for how many of those keys, the difference equals k and increment a variable
    to store the count and then return the variable.
    Time Complexcity: O(n)
    Space Complexcity: O(n)
"""



class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        # a set to store the count of number of pairs
        pairs = {}
        count = 0

        # keep the count of each number in the dict
            # if the numbers already exists, we increment the count, otherwise set it to 1
        for numbers in nums:
            if numbers in pairs:
                pairs[numbers] = pairs[numbers] + 1
            else:
                pairs[numbers] = 1


        for numbers in pairs:
            if(pairs[numbers] > 1 and k == 0) or (numbers+k in pairs and k>0):
                count += 1

        return count