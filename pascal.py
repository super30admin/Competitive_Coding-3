# Time Complexity: O(n2)
# Space Complexity: O(n)
class Solution:

    def pascalTriangle(self, row):
        result_out = [[]]
        result_out[0] = [1]


        # row count
        for i in range(1, row): # 1-> 3
            list1 = result_out[i - 1]  # 1
            # print(list1)
            list2 = []
            list2.append(1) # 1
            # iterate over the current row and add the current value with previous row
            # current column and previous column
            for j in range(1, i):
                list2.append(list1[j - 1] + list1[j])
            list2.append(1)

            # print(list2)

            result_out.append(list2)

        return result_out

trial = Solution()
row = 5
print(trial.pascalTriangle(row))





