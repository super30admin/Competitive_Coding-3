'''
PROBLEM 1

TIME COMPLEXITY: O(N^2)
SPACE COMPLEXITY: O(N^2)

- run the outer loop for number if rows i
- runnt the inner loop the number of times equal to row number
- create an array with first and last element equal to 1, otherwise set element at index i, j as  sum of elements i-1,j-1 and i-1,j


'''

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result=[]
        
        for i in range(0,numRows):
            temp=[]
            for j in range(0,i+1):
                if j==0 or j== i:
                    temp.append(1)
                else:
                    temp.append(result[i-1][j-1] + result[i-1][j]) 
            result.append(temp)
        return result


'''
PROBLEM 1

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(1)

- sort the array and start with two pointrs set at 0 and 1
- if nums[j]-nums[i]==k, increment the count. increase the range by incrementing j if nums[j]-nums[i]<k and decrease the range by incrementing i if nums[j]-nums[i]>k
- return count


'''


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count=0
        i=0
        j=1
        nums.sort()

        while(i<len(nums) and j<len(nums)):

            if i==j:
                j+=1
            elif i>0 and nums[i]==nums[i-1]:
                i+=1

            elif nums[j]-nums[i]==k:
                count+=1
                i+=1

            elif nums[j]-nums[i]<k:
                j+=1
            else:
                i+=1
                
        return count