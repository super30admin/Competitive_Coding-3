#Time complexity is O(n)
#Space complexity is O(n)
#Program ran successfully on leetcode
#No issues faced while coding this program

class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        #Creating an empty dictionary and list
        dic={}
        val=[]
        #inserting entries into dictionary with key as value at index i and value as index i
        for i in range(0,len(nums)):
            dic[nums[i]]=i
        for i in range(0,len(nums)):
            #Finding the complements of the nums[i] value
            comp1=nums[i]-k
            comp2=nums[i]+k
            x=[]
            if(comp1 in dic):
                #If the complement is value is present in the dictionary, creating a list and sorting that list
                x=[nums[i],comp1]
                x.sort()
                #Checking whether the sorted list is present in the val list
                #If the list is not present in val and the indexes are different then we will insert into val
                if(x not in val and i!=dic[comp1]):
                    val.append(x)
            if(comp2 in dic):
                #If the complement is value is present in the dictionary, creating a list and sorting that list
                x=[nums[i],comp2]
                x.sort()
                #Checking whether the sorted list is present in the val list
                #If the list is not present in val and the indexes are different then we will insert into val
                if(x not in val and i!=dic[comp2]):
                    val.append(x)
        #Finally returning the val
        return len(val)
