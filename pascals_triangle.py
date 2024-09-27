// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach:
we start by intialising the first element as 1 and then we start by taking the first and last value directly from the previous level.The remaining elements in the current level are populting by adding the previous level elements in pairs.

#Time complexity --> o(numRows**2)
#space complexity --> o(numRows**2)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows==0:
            return []
        out=[[1]]
        for i in range(1,numRows):
            out1=[None for j in range(i+1)]
            #we take the last array from the out array
            prev=out[i-1]
            #from the last array in the out result the first and last element are taken directly from the above and all the elements we add them in pairs and append to the out array.
            out1[0]=prev[0]
            out1[len(out1)-1]=prev[len(prev)-1]
            for i in range(len(prev)-1):
                out1[i+1]=prev[i]+prev[i+1]
            out.append(out1)
        return out
