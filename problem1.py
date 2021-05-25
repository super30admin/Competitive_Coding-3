class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 1:
            return [[1]]
        i = 1
        holdvalues = [[1]]
        while(i<numRows):
            prevlist = holdvalues[i-1]
            newlist = [1]
            for j in range(len(prevlist)-1):
                val = prevlist[j]+prevlist[j+1]
                newlist.append(val)
            newlist.append(1)
            holdvalues.append(newlist)
            i = i + 1
        return holdvalues


        
