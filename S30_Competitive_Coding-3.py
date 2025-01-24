# 532. K-diff Pairs in an Array_Solution

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        count= {}
        res= 0

        for i in nums:
            if i not in count:
                count[i]=1
            else:
                count[i] +=1
        print (count)

        for i in count:
            if k==0 and count[i]>1:
                res+=1 
            elif k>0 and i+k in count:
                res+=1

        return res

# TC: O(n)
# SC: O(n)

-------------------------------------------------------------------------------------------------------

# 118. Pascal's Triangle_Solution

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res=[[1]]

        for i in range(numRows -1):
            temp= [0]+ res[-1]+[0]
            row= []

            for j in range(len(res[-1])+1):
                row.append(temp[j]+temp[j+1])
            res.append(row)
        return res

# TC: O(n^2)
# SC: O(n^2)