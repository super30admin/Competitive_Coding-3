class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        #O(N^2)
        #O(1)
        #1st row fixed
        subarray=[[1]]
        #rows==0>>[]#
        if not numRows:
            return []
        #rows==1>>subarray
        if numRows==1:
            return subarray
        #start with 2nd row till end
        for i in range(2,numRows+1):
            #previous row
            prevrow=subarray[-1]
            #initialize secondlist
            secondlist=[]
            #append 1 at start and end
            secondlist.append(1)
            #for 2nd loop , run through prevrows length
            for j in range(1,len(prevrow)):
                #take sum in pairs and append
                sumi=prevrow[j-1]+prevrow[j]
                secondlist.append(sumi)
            secondlist.append(1)
            #append sublist to main list
            subarray.append(secondlist)
        return subarray