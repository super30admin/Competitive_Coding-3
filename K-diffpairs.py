from collections import Counter
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        '''Time Complexity: O(n)
        Space Complexity: O(1)'''
        if len(nums)==0:
            return 0
        #Here I have created an array if it is asked to return the pairs as well. Else one can simple maintain a counter variable
        result=[]
        #Frequency hashmap
        hashmap=Counter(nums)
        
        #If k is not 0
        if k!=0:
            for key in hashmap:
                #check if sum in hashmap
                add=key+k
                if add in hashmap:
                    result.append((key, add))
        #if key is 0 check only for values with freq > 1
        elif k==0:
            for key in hashmap:
                if hashmap[key]>1 and key - key == k:
                    result.append((key,key))
        return len(result)
                
