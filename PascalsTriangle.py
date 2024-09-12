#TC: O(n^2)
#SC: O(1)

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        li=[]
        for i in range(numRows):
            if (i==0): li.append([1])
            elif (i==1): li.append([1,1])
            else:
                nli=[]
                nli.append(1)
                for k in range(1,len(li[i-1])):
                    s=li[i-1][k]+li[i-1][k-1]
                    nli.append(s)
                nli.append(1)
                li.append(nli)
        return li
            
            