# Time Complexity: O(n^2)
# Space Complexity: O(n)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        arr=[[1]]
        if numRows==1:
            return arr
        arr.append([1,1])
        for i in range(2, numRows):
            tarr=[1]
            pn=len(arr[i-1])
            for j in range(pn-1):
                tarr.append(arr[i-1][j]+arr[i-1][j+1])
            tarr.append(1)
            arr.append(tarr)
        
        return arr




