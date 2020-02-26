# Problem 1: #43
## Time Complexity :
O(n)

## Space Complexity :
Solution 1: O(1)\
Solution 2: O(n)

## Did this code successfully run on Leetcode :
Solution 1: Yes\
Solution 2: No. 36/72 test cases passed.

## Any problem you faced while coding this :
Yes. I can not identify my error in Solution 2.

## Your code here along with comments explaining your approach
### Solution 1: Brute-Force.
      class Solution:
        def findPairs(self, nums: List[int], k: int) -> int:
            res = 0
            c = collections.Counter(nums)
            #Logic
            for i in c:
                if k > 0 and i + k in c or k == 0 and c[i] > 1:
                    res += 1
            return res

### Solution 2:
    class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        result=[]
        nums=list(set(nums))
        #print(nums)
        #Initializing pointers
        ptr1=0
        ptr2=1
        #Edge case
        if len(nums)==0:
            return result
            #Logic
        for i in range(ptr1,len(nums)-1):
            if nums[ptr1]+k==nums[ptr2]:
                result.append((nums[ptr1],nums[ptr2]))
                ptr2+=1
            else:
                ptr2+=1
            if ptr2==len(nums)-1:
                ptr1+=1
        print(result)
        return len(result)

# Problem 2: #42
## Time Complexity :
O(n*n)

## Space Complexity :
O(n)

## Did this code successfully run on Leetcode :
Yes.

## Any problem you faced while coding this :
Yes. I couldn't find a better solution.

## Your code here along with comments explaining your approach
### Solution:
    class Solution:
          def generate(self, numRows: int) -> List[List[int]]:   

              result = []  
              for k in range(1,numRows+1):
                  res = [0]*(k)
                  res[0] = 1
                  res[k-1] = 1
                  for i in range(1,k-1):
                      res[i] = result[k-2][i-1] + result[k-2][i]
                  result.append(res)                
              return result
