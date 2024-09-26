// Time Complexity : O(n) 
// Space Complexity : O(n) k=total elements in list
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


'''
This is a brute force approach.

1. if not at level 1, append [1] at the start and end of  current list. 

2. Get the sum from previous list by looping through the previous list.  

3. append [1] at end of list. 

3. return the final result list.

'''

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        s= [ [1] ]
        while len(s) < numRows:
            curr=s[len(s)-1]
            n=[1]
            for i in range(0,len(curr)-1):
                n.append(curr[i]+curr[i+1])
            n.append(1)
            s.append(n)
        return s
            