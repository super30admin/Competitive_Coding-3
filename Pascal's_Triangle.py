# // Time Complexity :O(nxn)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        nums=[[1]]
        if numRows==0:
            return []
        
        for i in range(1,numRows):
            sublist=[]
            for j in range(i+1):
                if(j==0 or j==i):
                    sublist.append(1)
                else:
                    sublist.append(nums[i-1][j-1]+nums[i-1][j])
            nums.append(sublist)
        return nums
                    