class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        """
        hashmap o(n) solution below:
        Here we iterate through all the items in the nums array and store the frequency of each item in a hashmap with key as item and value as its frequency. If k is >0 we suppose the other number to be current number + k and increase count by 1

        else if k==0 we know that we should search for other number =to this number in this array excluding the current number, so we just increase count by 1 for every frequency >1 encountered so that if k=0 and if we need to find a pair we just iterate throuhg the list and take the unique element whose frequency is greater than 0
        TC: O(n)
        Sc: O(n)

        """
        count = 0
        hashMap = dict()
        for i in range(len(nums)):
            if nums[i] not in hashMap:
                hashMap[nums[i]] = 1
            else:
                hashMap[nums[i]] += 1
        for number in hashMap.keys():
            otherNumber = k + number
            if k > 0 and otherNumber in hashMap.keys():
                count += 1
            elif k == 0 and hashMap[number] > 1:
                count += 1

        return count

        """
        Timeout below due to brute force using hashset and using two loops to iterate all the
        elements and storing only in hashset i,j if both i,j and j,i are not hashset to               maintian uniquenes
        """


#         hashset=set()
#         count=0
#         for i in range(len(nums)):
#             for j in range(i+1, len(nums)):
#                 if abs(nums[i]-nums[j])==k:
#                     if (nums[i],nums[j]) not in hashset and (nums[j],nums[i]) not in hashset:
#                         hashset.add((nums[i],nums[j]))
#                         count+=1

#         return count
# return list(hashset)


solve=Solution()
nums=[3,1,4,1,5]
k=0
print(solve.findPairs(nums, k))

#         hashset=set()
#         count=0
#         for i in range(len(nums)):
#             for j in range(i+1, len(nums)):
#                 if abs(nums[i]-nums[j])==k:
#                     if (nums[i],nums[j]) not in hashset and (nums[j],nums[i]) not in hashset:
#                         hashset.add((nums[i],nums[j]))
#                         count+=1

#         return count
# return list(hashset)
