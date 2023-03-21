#time complexity - O(n*n)
#space complexity - O(1)
#Did this code successfully run on Leetcode : yes
#Your code here along with comments explaining your approach
# create a result list of lists with [[1]] and iterate over it for range of numrows given
# for each row get the prev row elements and calculate the current row elements by adding i and i-1 elements of 
# previous row except for first and last elements which are always one.
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[1]]
        for i in range(2,numRows+1):
            curr = result[-1]
            temp = []
            for j in range(i):
                if j==0 or j==i-1:
                    temp.append(1)
                else:
                    temp.append(curr[j-1] + curr[j])
            result.append(temp)
        return result



