class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        if numRows==0:
            return []
        if numRows==1:
            return [[1]]
        if numRows==2:
            return [[1],[1,1]]
        prev=[1,1]
        res=[[1],[1,1]]
        for i in range(2,numRows):
            arr=[1]*(i+1)
            for i in range(len(prev)-1):
                arr[i+1]=prev[i]+prev[i+1]
            res.append(arr)
            prev=arr
        return res

    #time-O(n**2) space-O(1)