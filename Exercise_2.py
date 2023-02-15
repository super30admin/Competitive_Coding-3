#Time Complexity : O(N), N being the number of values in the array. 
#Space Complexity : O(N+M), N being the number of values in array and M begin the number
# of pairs in the array.
#Did this code successfully run on Leetcode : Yes.
#Any problem you faced while coding this : Had a little trouble with the order of subtraction
# that required some minor debugging. Also, I was initially trying to lower the space complexity
# before deciding to go with the added space. I think there might be a better way though. 

#Your code here along with comments explaining your approach in three sentences only
'''Create a dictionary of value as key and index as value. Then, find the index of nums[i]-k if 
it exists. Keep track of result in a set and return the length of the set. 
'''

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        #create a dictionary of value as key and index as value. 
        dictionary = {}
        for i in range(len(nums)):
            if nums[i] in dictionary.keys():
                dictionary[nums[i]].append(i)
            else:
                dictionary[nums[i]]=[i]
        result = set()
        #find the difference in the dictionary. Sort the pair and add into set. 
        for i in range(len(nums)):
            if nums[i]-k in dictionary.keys():
                index_array = dictionary[nums[i]-k]
                if len(index_array)==1 and index_array[0]==i:
                    pass
                else:
                    temp = [nums[i], nums[index_array[0]]]
                    temp.sort()
                    result.add(tuple(temp))
        #return len of the set. 
        return len(result)