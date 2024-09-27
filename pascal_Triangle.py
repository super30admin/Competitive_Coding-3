"""Time Complexity : O(n^2)
   Space Complexity : O(1)
   Did this code successfully run on Leetcode : Yes
   Any problem you faced while coding this : No


   Your code here along with comments explaining your approach """
   
   
    def generate(self, numRows: int) -> List[List[int]]:
        dir1 ={}
        dir1[0] = [0,1,0]
        for i in range(1,numRows):
            dir1[i] = [0]
            j = 0
            arr = dir1.get(i-1)
            while j+1 <= len(dir1[i-1])-1:
                dir1[i].append(arr[j]+arr[j+1])
                j = j + 1
            dir1[i].append(0)
            dir1[i-1].remove(0)
            dir1[i-1].remove(0)
        dir1[numRows-1].remove(0)
        dir1[numRows-1].remove(0)
        return dir1.values()