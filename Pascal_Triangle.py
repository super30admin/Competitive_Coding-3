#Time:O(n)
#Space:O(n)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans = [[1]]
        for i in range(2,numRows+1):
            temp_list = []
            temp_list.append(1)
            for j in range(1,i-1):
                temp_list.append(ans[i-2][j]+ans[i-2][j-1])
            temp_list.append(1)
            ans.append(temp_list)
        return ans
        