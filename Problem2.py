#Time complexity: O(n)
#Space complexity: O(n)

#Accepted on leetcode

#Approach:
#Construct a hashmap, record number of occurences of each element
#Iterate through the array, for each elem 'x', check the presence of x + k (or alternatively x - k), check in only one direction to prevent duplicates
#If k == 0 make sure element occurs more than once to prevent duplicates

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hashMap = {}
        count = 0
        for x in nums:
            if x in hashMap:
                hashMap[x] += 1
            else:
                hashMap[x] = 1
        
        for key in hashMap:
            complement = key + k
            if complement in hashMap:
                if complement == key:
                    if hashMap[complement] > 1:
                        count += 1
                else:
                    count += 1

        return count


