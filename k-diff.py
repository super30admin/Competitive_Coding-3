"""
The approach here is to maintain a hashmap and a output array. we iterate over the array first and
then store the value and the index in the hashmap. once we are done iterating. we now again iterate 
over the array again. now we deduct the particular index value with the target value and check if the
resultant value is present in the hashmap and if the indexes differ. if so we sort the two values and
append them in the resultant array also checking for if the values already exsists.
Leetcode - Running
Time complexity - O(N^2)
space complexity - O(N)

"""

def findPairs(self, nums, k):
        result = {}
        counter = []
        if k >= 0:
            for i in range(len(nums)):
                result[nums[i]] = i
            for j in range(len(nums)):
                val = nums[j] - k
                if val in result and j != result[val]:
                    temp = sorted([val,nums[j]])
                    if temp not in counter:
                        counter.append(temp)
            return len(counter)     
        else:
            return 0