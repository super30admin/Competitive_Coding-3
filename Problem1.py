#Competitive Coding 3
#Problem1 : https://leetcode.com/problems/k-diff-pairs-in-an-array/
#All test cases passed on Leetcode
#Time Complexity-O(NlogN)
#Space Complexity-O(1)

class Solution:
    def findPairs(self, nums, k):
        #Approach:Sort the array
        #take Two pointers :slow and fast pointer , take difference between the values at slow and fast pointer and check below cases
        #3 cases:diff<k ;  diff>k and diff==k
        #for uniqueness :check value at fast-1 and fast positions , if there are same -fast+=1
        
        nums.sort()
        #initializations
        #to maintain count of unique k-dff pairs in the array
        count=0 
        slow=0
        fast=0
        n=len(nums)
        
        #we do exit the loop when slow or fast is greater than n
        while slow<n and fast<n:
            diff=nums[fast]-nums[slow]
            #case 1: diff<k
            if slow==fast or diff<k:
                fast+=1
            #case 2:diff>k
            elif diff>k:
                slow+=1
            #case 3: diff==k
            else:
                slow+=1
                fast+=1
                count+=1
                while fast<n and nums[fast]==nums[fast-1]:
                    fast+=1
        return count
            
sol = Solution()
nums=[3, 1, 4, 1, 5]
k=2
count=sol.findPairs(nums,k)
print(count)



        
        















