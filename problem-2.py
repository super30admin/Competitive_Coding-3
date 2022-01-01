"""
Problem: https://leetcode.com/problems/pascals-triangle-ii/

Approach :

1. we use 2 lists, cur and prev which are empty initialy
2. we iterate till the rowIndex, if rowIndex is 0, we make prev = [1] and if rowIndex is 1, we make prev =[1,1] and continue
3. one we are at index 2 we calcualte the cur list as follows:
    a.append 1 to curr list 
    b. while our prev list is empty, we append the sum of pairs of prev list to cur list
    c. append 1 to cur list
4. the we make prev=curr and cur = [] so that we can calcualte the next cur list based on the prev list

"""

# Time Complexity : O(n2)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        n = rowIndex
        prev= []
        cur = []
        for i in range (n+1):
            if i==0:
                prev = [1]
                continue
            if i==1:
                prev = [1,1]
                continue
            cur.append(1)
            for j in range(len(prev)-1):
                cur.append(prev[j]+prev[j+1])
            cur.append(1)
            prev = cur
            cur = []
                
        return prev