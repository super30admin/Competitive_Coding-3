#Leet code -Pascal Traingle -118
# Time complexity -O(N^2)
#Space Complexity -O(N^2)
# passed all test cases

class Solution(object):
    def generate(self, n):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        m=[]
        for i in range(n):
            m.append([])
            for j in range(i+1):
                if j in (0,i):
                    m[i].append(1)
                else:
                    m[i].append(m[i-1][j-1]+m[i-1][j])
        return m