# Time Complexity :
# O(N^2)

# Space Complexity :
# O(N)

# Did this code successfully run on Leetcode :
#Yes

#At each level, we maintain a sliding window that moves from left to right end of the previous level,and sum the elements in the sliding when moving and add to new level
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0 :
            return [[]]
   
        return_arr = [[1]]

        for i in range(1,numRows):
            prev_list = return_arr[i-1]
            inter = []
            inter.append(prev_list[0])
            for second_value in range(1, len(prev_list)):
                inter.append(prev_list[second_value-1] + prev_list[second_value])
            inter.append(prev_list[-1])
            return_arr.append(inter)
        return return_arr
