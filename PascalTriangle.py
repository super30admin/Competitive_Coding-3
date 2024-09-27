class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        arr=[]
        for i in range(0,numRows):
            li=[]
            for j in range(0,i+1):
                if j==0 or j==i:
                    li.append(1)
                else:
                    val=arr[i-1][j-1]+arr[i-1][j]
                    li.append(val)
            arr.append(li)
        return arr
    
    """Time complexity-O(n^2)
    Space complexity-O(1)"""
                    
        