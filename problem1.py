#Pascal's Triangle

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        final_arr = [[1]]
        if numRows == 1:
            return final_arr
        final_arr.append([1,1])
        if numRows == 2:
            return final_arr 
        for i in range(2,numRows):
            current_arr = [1]
            prev_arr = final_arr[-1]
            for i_idx in range(len(prev_arr)-1):
                curr_val = prev_arr[i_idx]+prev_arr[i_idx+1]
                current_arr.append(curr_val)
            current_arr.append(1)
            final_arr.append(current_arr)
        return final_arr
